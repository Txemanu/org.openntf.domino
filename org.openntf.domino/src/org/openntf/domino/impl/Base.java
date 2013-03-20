/*
 * Copyright OpenNTF 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.domino.impl;

import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openntf.domino.thread.DominoLockSet;
import org.openntf.domino.thread.DominoReference;
import org.openntf.domino.thread.DominoReferenceQueue;
import org.openntf.domino.types.Encapsulated;
import org.openntf.domino.utils.DominoUtils;
import org.openntf.domino.utils.Factory;

// TODO: Auto-generated Javadoc
/**
 * The Class Base.
 * 
 * @param <T>
 *            the generic type
 * @param <D>
 *            the generic type
 */
public abstract class Base<T extends org.openntf.domino.Base<D>, D extends lotus.domino.Base> implements org.openntf.domino.Base<D> {
	/** The Constant log_. */
	private static final Logger log_ = Logger.getLogger(Base.class.getName());

	// TODO NTF - we really should keep a Map of lotus objects to references, so we can only auto-recycle when we know there are no other
	// references to the same shared object.
	// problem today is: there's no clear way to determine an identity for the NotesBase object.
	/** The recycle queue. */
	private static ThreadLocal<DominoReferenceQueue> recycleQueue = new ThreadLocal<DominoReferenceQueue>() {
		@Override
		protected DominoReferenceQueue initialValue() {
			return new DominoReferenceQueue();
		};
	};

	private long cpp_object = 0l;

	// /** The reference bag. */
	// private static ThreadLocal<Set<DominoReference>> referenceBag = new ThreadLocal<Set<DominoReference>>() {
	// @Override
	// protected Set<DominoReference> initialValue() {
	// return new HashSet<DominoReference>();
	// // return Collections.newSetFromMap(new WeakHashMap<DominoReference, Boolean>());
	// };
	// };

	/** The Constant lockedRefSet. */
	private static final DominoLockSet lockedRefSet = new DominoLockSet();

	/** The get cpp method. */
	private static Method getCppMethod;

	/** The is invalid method. */
	private static Method isInvalidMethod;
	static {
		try {
			getCppMethod = lotus.domino.local.NotesBase.class.getDeclaredMethod("GetCppObj", (Class<?>[]) null);
			getCppMethod.setAccessible(true);
			isInvalidMethod = lotus.domino.local.NotesBase.class.getDeclaredMethod("isInvalid", (Class<?>[]) null);
			isInvalidMethod.setAccessible(true);
		} catch (Exception e) {
			DominoUtils.handleException(e);
		}

	}

	// /** The recycled_. */
	// protected boolean recycled_;

	/** The delegate_. */
	protected D delegate_; // NTF final???

	// /** The encapsulated_. */
	// private boolean encapsulated_ = false;

	/** The parent_. */
	private org.openntf.domino.Base<?> parent_;

	// TODO NTF - not sure about maintaining a set pointer to children. Not using for now. Just setting up (no pun intended)
	/** The children_. */
	private final Set<org.openntf.domino.Base<?>> children_ = Collections
			.newSetFromMap(new WeakHashMap<org.openntf.domino.Base<?>, Boolean>());

	/**
	 * Sets the parent.
	 * 
	 * @param parent
	 *            the new parent
	 */
	void setParent(org.openntf.domino.Base<?> parent) {
		parent_ = parent;
		// TODO NTF - add to parent's children set?
	}

	/**
	 * Gets the parent.
	 * 
	 * @return the parent
	 */
	org.openntf.domino.Base<?> getParent() {
		return parent_;
	}

	/**
	 * Instantiates a new base.
	 * 
	 * @param delegate
	 *            the delegate
	 * @param parent
	 *            the parent
	 */
	@SuppressWarnings("rawtypes")
	protected Base(D delegate, org.openntf.domino.Base<?> parent) {
		drainQueue();
		if (parent != null) {
			setParent(parent);
		}
		if (delegate != null) {
			if (delegate instanceof org.openntf.domino.impl.Base) {
				if (log_.isLoggable(Level.INFO))
					log_.log(Level.INFO, "Why are you wrapping a non-Lotus object? " + delegate.getClass().getName());
				recycleQueue.get().bagReference(
						new DominoReference(this, recycleQueue.get(), ((org.openntf.domino.impl.Base) delegate).getDelegate()));
			} else if (delegate instanceof lotus.domino.local.NotesBase) {
				delegate_ = delegate;
				cpp_object = getLotusId((lotus.domino.local.NotesBase) delegate);
				if (delegate instanceof lotus.domino.Name || delegate instanceof lotus.domino.DateTime
						|| delegate instanceof lotus.domino.Session) {
					// No reference needed. Will be recycled directly...
					// Not creating auto-recycle references for Sessions
					// TODO - NTF come up with a better solution for recycling Sessions!!!
				} else {
					recycleQueue.get().bagReference(new DominoReference(this, recycleQueue.get(), delegate));
				}
			} else {
				if (log_.isLoggable(Level.WARNING))
					log_.log(Level.WARNING, "Why are you wrapping a non-Lotus object? " + delegate.getClass().getName());
			}
		}
		// else {
		// encapsulated_ = true;
		// }

	}

	/**
	 * Gets the lotus id.
	 * 
	 * @param base
	 *            the base
	 * @return the lotus id
	 */
	public static long getLotusId(lotus.domino.local.NotesBase base) {
		try {
			return ((Long) getCppMethod.invoke(base, (Object[]) null)).longValue();
		} catch (Exception e) {
			return 0L;
		}
	}

	/**
	 * _get recycle queue.
	 * 
	 * @return the domino reference queue
	 */
	private static DominoReferenceQueue _getRecycleQueue() {
		return recycleQueue.get();
	}

	/**
	 * Drain queue.
	 */
	public static int drainQueue() {
		int result = 0;
		DominoReferenceQueue drq = _getRecycleQueue();
		Reference<?> ref = drq.poll();

		while (ref != null) {
			ref = drq.poll();
			result++;
		}
		return result;
	}

	/**
	 * Gets the delegate.
	 * 
	 * @param wrapper
	 *            the wrapper
	 * @return the delegate
	 */
	@SuppressWarnings("rawtypes")
	public static lotus.domino.Base getDelegate(lotus.domino.Base wrapper) {
		if (wrapper instanceof org.openntf.domino.impl.Base) {
			return ((org.openntf.domino.impl.Base) wrapper).getDelegate();
		}
		return wrapper;
	}

	/**
	 * Gets the cpp_object.
	 * 
	 * @param wrapper
	 *            the wrapper
	 * @return the cpp handle
	 */
	@SuppressWarnings("rawtypes")
	public static long getDelegateId(org.openntf.domino.impl.Base wrapper) {
		return ((org.openntf.domino.impl.Base) wrapper).cpp_object;
	}

	/**
	 * Gets the delegate.
	 * 
	 * @return the delegate
	 */
	protected D getDelegate() {
		return delegate_;
	}

	/**
	 * Checks if is encapsulated.
	 * 
	 * @return true, if is encapsulated
	 */
	public boolean isEncapsulated() {
		return (this instanceof Encapsulated);
	}

	/**
	 * Checks if is locked.
	 * 
	 * @param base
	 *            the base
	 * @return true, if is locked
	 */
	public static boolean isLocked(lotus.domino.Base base) {
		return lockedRefSet.isLocked(base);
	}

	/**
	 * Unlock.
	 * 
	 * @param base
	 *            the base
	 */
	public static void unlock(lotus.domino.Base base) {
		lockedRefSet.unlock(base);
	}

	/**
	 * Lock.
	 * 
	 * @param base
	 *            the base
	 */
	public static void lock(lotus.domino.Base base) {
		lockedRefSet.lock(base);
	}

	/**
	 * Lock.
	 * 
	 * @param allYourBase
	 *            the all your base
	 */
	public static void lock(lotus.domino.Base... allYourBase) {
		for (lotus.domino.Base everyZig : allYourBase) {
			lockedRefSet.lock(everyZig);
		}
	}

	/**
	 * Unlock.
	 * 
	 * @param allYourBase
	 *            the all your base
	 */
	public static void unlock(lotus.domino.Base... allYourBase) {
		lockedRefSet.unlock(allYourBase);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.Base#recycle()
	 */
	public void recycle() {
		recycle(this);
	}

	/**
	 * Checks if is recycled.
	 * 
	 * @param base
	 *            the base
	 * @return true, if is recycled
	 */
	public static boolean isRecycled(lotus.domino.local.NotesBase base) {
		try {
			return ((Boolean) isInvalidMethod.invoke(base, (Object[]) null)).booleanValue();
		} catch (Exception e) {
			return false;
		}
	}

	// /**
	// * Decrement counter.
	// *
	// * @param base
	// * the base
	// * @return the int
	// */
	// public static int decrementCounter(lotus.domino.local.NotesBase base) {
	// int count = lotusReferenceCounter_.decrement(base);
	// return count;
	// }

	// /**
	// * Increment counter.
	// *
	// * @param base
	// * the base
	// * @return the int
	// */
	// public static int incrementCounter(lotus.domino.local.NotesBase base) {
	// int count = lotusReferenceCounter_.increment(base);
	// return count;
	// }

	// Convert a wrapper object to its delegate form
	/**
	 * To lotus.
	 * 
	 * @param baseObj
	 *            the base obj
	 * @return the lotus.domino. base
	 */
	public static lotus.domino.Base toLotus(lotus.domino.Base baseObj) {
		if (baseObj instanceof org.openntf.domino.Base) {
			return ((Base<?, ?>) baseObj).getDelegate();
		}
		return baseObj;
	}

	// Convert a wrapper object to its delegate form, allowing for non-Lotus objects (e.g. for getDocumentByKey)
	/**
	 * To lotus.
	 * 
	 * @param baseObj
	 *            the base obj
	 * @return the lotus.domino. base version or the object itself, as appropriate
	 */
	public static Object toLotus(Object baseObj) {
		if (baseObj instanceof org.openntf.domino.Base) {
			return ((Base<?, ?>) baseObj).getDelegate();
		}
		return baseObj;
	}

	/**
	 * To lotus.
	 * 
	 * @param values
	 *            the values
	 * @return the java.util. vector
	 */
	public static java.util.Vector<Object> toLotus(Collection<?> values) {
		java.util.Vector<Object> result = new java.util.Vector<Object>(values.size());
		for (Object value : values) {
			if (value instanceof lotus.domino.Base) {
				result.add(toLotus((lotus.domino.Base) value));
			} else {
				result.add(value);
			}
		}
		return result;
	}

	/**
	 * Recycle.
	 * 
	 * @param base
	 *            the base
	 * @return true, if successful
	 */
	public static boolean recycle(lotus.domino.local.NotesBase base) {
		boolean result = false;
		if (!isLocked(base)) {
			try {
				base.recycle();
				result = true;
			} catch (Throwable t) {
				Factory.countRecycleError();
				// shikata ga nai
			}
		} else {
			System.out.println("Not recycling a " + base.getClass().getName() + " because its locked.");
		}
		return result;
	}

	/**
	 * Recycle.
	 * 
	 * @param o
	 *            the o
	 */
	public static void recycle(Object o) {
		if (o instanceof lotus.domino.Base) {
			if (o instanceof lotus.domino.local.NotesBase) {
				recycle((lotus.domino.local.NotesBase) o);
			}
		}
	}

	// /**
	// * Checks if is recycled.
	// *
	// * @return true, if is recycled
	// */
	// public boolean isRecycled() {
	// return recycled_;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.Base#recycle(java.util.Vector)
	 */
	@SuppressWarnings("rawtypes")
	public void recycle(Vector arg0) {
		for (Object o : arg0) {
			if (o instanceof org.openntf.domino.impl.Base) {
				recycle((org.openntf.domino.impl.Base) o);
			} else if (o instanceof lotus.domino.local.NotesBase) {
				recycle((lotus.domino.local.NotesBase) o);
			}
		}
	}

}
