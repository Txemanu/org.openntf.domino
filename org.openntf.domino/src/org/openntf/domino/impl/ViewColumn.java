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

import lotus.domino.NotesException;

import org.openntf.domino.utils.DominoUtils;
import org.openntf.domino.utils.Factory;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewColumn.
 */
public class ViewColumn extends Base<org.openntf.domino.ViewColumn, lotus.domino.ViewColumn> implements org.openntf.domino.ViewColumn {

	/**
	 * Instantiates a new view column.
	 * 
	 * @param delegate
	 *            the delegate
	 * @param parent
	 *            the parent
	 */
	public ViewColumn(lotus.domino.ViewColumn delegate, org.openntf.domino.Base<?> parent) {
		super(delegate, parent);
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getAlignment()
	 */
	@Override
	public int getAlignment() {
		try {
			return getDelegate().getAlignment();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getColumnValuesIndex()
	 */
	@Override
	public int getColumnValuesIndex() {
		try {
			return getDelegate().getColumnValuesIndex();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getDateFmt()
	 */
	@Override
	public int getDateFmt() {
		try {
			return getDelegate().getDateFmt();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getFontColor()
	 */
	@Override
	public int getFontColor() {
		try {
			return getDelegate().getFontColor();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getFontFace()
	 */
	@Override
	public String getFontFace() {
		try {
			return getDelegate().getFontFace();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getFontPointSize()
	 */
	@Override
	public int getFontPointSize() {
		try {
			return getDelegate().getFontPointSize();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getFontStyle()
	 */
	@Override
	public int getFontStyle() {
		try {
			return getDelegate().getFontStyle();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getFormula()
	 */
	@Override
	public String getFormula() {
		try {
			return getDelegate().getFormula();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getHeaderAlignment()
	 */
	@Override
	public int getHeaderAlignment() {
		try {
			return getDelegate().getHeaderAlignment();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getHeaderFontColor()
	 */
	@Override
	public int getHeaderFontColor() {
		try {
			return getDelegate().getHeaderFontColor();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getHeaderFontFace()
	 */
	@Override
	public String getHeaderFontFace() {
		try {
			return getDelegate().getHeaderFontFace();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getHeaderFontPointSize()
	 */
	@Override
	public int getHeaderFontPointSize() {
		try {
			return getDelegate().getHeaderFontPointSize();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getHeaderFontStyle()
	 */
	@Override
	public int getHeaderFontStyle() {
		try {
			return getDelegate().getHeaderFontStyle();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getItemName()
	 */
	@Override
	public String getItemName() {
		try {
			return getDelegate().getItemName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getListSep()
	 */
	@Override
	public int getListSep() {
		try {
			return getDelegate().getListSep();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getNumberAttrib()
	 */
	@Override
	public int getNumberAttrib() {
		try {
			return getDelegate().getNumberAttrib();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getNumberDigits()
	 */
	@Override
	public int getNumberDigits() {
		try {
			return getDelegate().getNumberDigits();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getNumberFormat()
	 */
	@Override
	public int getNumberFormat() {
		try {
			return getDelegate().getNumberFormat();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.impl.Base#getParent()
	 */
	@Override
	public View getParent() {
		try {
			return Factory.fromLotus(getDelegate().getParent(), View.class, this);
		} catch (NotesException ne) {
			DominoUtils.handleException(ne);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getPosition()
	 */
	@Override
	public int getPosition() {
		try {
			return getDelegate().getPosition();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getResortToViewName()
	 */
	@Override
	public String getResortToViewName() {
		try {
			return getDelegate().getResortToViewName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getSecondaryResortColumnIndex()
	 */
	@Override
	public int getSecondaryResortColumnIndex() {
		try {
			return getDelegate().getSecondaryResortColumnIndex();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getTimeDateFmt()
	 */
	@Override
	public int getTimeDateFmt() {
		try {
			return getDelegate().getTimeDateFmt();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getTimeFmt()
	 */
	@Override
	public int getTimeFmt() {
		try {
			return getDelegate().getTimeFmt();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getTimeZoneFmt()
	 */
	@Override
	public int getTimeZoneFmt() {
		try {
			return getDelegate().getTimeZoneFmt();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getTitle()
	 */
	@Override
	public String getTitle() {
		try {
			return getDelegate().getTitle();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#getWidth()
	 */
	@Override
	public int getWidth() {
		try {
			return getDelegate().getWidth();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isAccentSensitiveSort()
	 */
	@Override
	public boolean isAccentSensitiveSort() {
		try {
			return getDelegate().isAccentSensitiveSort();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isCaseSensitiveSort()
	 */
	@Override
	public boolean isCaseSensitiveSort() {
		try {
			return getDelegate().isCaseSensitiveSort();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isCategory()
	 */
	@Override
	public boolean isCategory() {
		try {
			return getDelegate().isCategory();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isConstant()
	 */
	@Override
	public boolean isConstant() {
		try {
			return getDelegate().isConstant();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isField()
	 */
	@Override
	public boolean isField() {
		try {
			return getDelegate().isField();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isFontBold()
	 */
	@Override
	public boolean isFontBold() {
		try {
			return getDelegate().isFontBold();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isFontItalic()
	 */
	@Override
	public boolean isFontItalic() {
		try {
			return getDelegate().isFontItalic();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isFontStrikethrough()
	 */
	@Override
	public boolean isFontStrikethrough() {
		try {
			return getDelegate().isFontStrikethrough();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isFontUnderline()
	 */
	@Override
	public boolean isFontUnderline() {
		try {
			return getDelegate().isFontUnderline();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isFormula()
	 */
	@Override
	public boolean isFormula() {
		try {
			return getDelegate().isFormula();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHeaderFontBold()
	 */
	@Override
	public boolean isHeaderFontBold() {
		try {
			return getDelegate().isHeaderFontBold();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHeaderFontItalic()
	 */
	@Override
	public boolean isHeaderFontItalic() {
		try {
			return getDelegate().isHeaderFontItalic();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHeaderFontStrikethrough()
	 */
	@Override
	public boolean isHeaderFontStrikethrough() {
		try {
			return getDelegate().isHeaderFontStrikethrough();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHeaderFontUnderline()
	 */
	@Override
	public boolean isHeaderFontUnderline() {
		try {
			return getDelegate().isHeaderFontUnderline();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHidden()
	 */
	@Override
	public boolean isHidden() {
		try {
			return getDelegate().isHidden();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHideDetail()
	 */
	@Override
	public boolean isHideDetail() {
		try {
			return getDelegate().isHideDetail();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isHideFormula()
	 */
	@Override
	public boolean isHideFormula() {
		try {
			return getDelegate().isHideFormula();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isIcon()
	 */
	@Override
	public boolean isIcon() {
		try {
			return getDelegate().isIcon();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isNumberAttribParens()
	 */
	@Override
	public boolean isNumberAttribParens() {
		try {
			return getDelegate().isNumberAttribParens();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isNumberAttribPercent()
	 */
	@Override
	public boolean isNumberAttribPercent() {
		try {
			return getDelegate().isNumberAttribPercent();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isNumberAttribPunctuated()
	 */
	@Override
	public boolean isNumberAttribPunctuated() {
		try {
			return getDelegate().isNumberAttribPunctuated();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isResize()
	 */
	@Override
	public boolean isResize() {
		try {
			return getDelegate().isResize();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isResortAscending()
	 */
	@Override
	public boolean isResortAscending() {
		try {
			return getDelegate().isResortAscending();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isResortDescending()
	 */
	@Override
	public boolean isResortDescending() {
		try {
			return getDelegate().isResortDescending();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isResortToView()
	 */
	@Override
	public boolean isResortToView() {
		try {
			return getDelegate().isResortToView();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isResponse()
	 */
	@Override
	public boolean isResponse() {
		try {
			return getDelegate().isResponse();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isSecondaryResort()
	 */
	@Override
	public boolean isSecondaryResort() {
		try {
			return getDelegate().isSecondaryResort();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isSecondaryResortDescending()
	 */
	@Override
	public boolean isSecondaryResortDescending() {
		try {
			return getDelegate().isSecondaryResortDescending();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isShowTwistie()
	 */
	@Override
	public boolean isShowTwistie() {
		try {
			return getDelegate().isShowTwistie();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isSortDescending()
	 */
	@Override
	public boolean isSortDescending() {
		try {
			return getDelegate().isSortDescending();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#isSorted()
	 */
	@Override
	public boolean isSorted() {
		try {
			return getDelegate().isSorted();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setAccentSensitiveSort(boolean)
	 */
	@Override
	public void setAccentSensitiveSort(boolean flag) {
		try {
			getDelegate().setAccentSensitiveSort(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setAlignment(int)
	 */
	@Override
	public void setAlignment(int alignment) {
		try {
			getDelegate().setAlignment(alignment);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setCaseSensitiveSort(boolean)
	 */
	@Override
	public void setCaseSensitiveSort(boolean flag) {
		try {
			getDelegate().setCaseSensitiveSort(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setDateFmt(int)
	 */
	@Override
	public void setDateFmt(int format) {
		try {
			getDelegate().setDateFmt(format);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontBold(boolean)
	 */
	@Override
	public void setFontBold(boolean flag) {
		try {
			getDelegate().setFontBold(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontColor(int)
	 */
	@Override
	public void setFontColor(int color) {
		try {
			getDelegate().setFontColor(color);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontFace(java.lang.String)
	 */
	@Override
	public void setFontFace(String face) {
		try {
			getDelegate().setFontFace(face);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontItalic(boolean)
	 */
	@Override
	public void setFontItalic(boolean flag) {
		try {
			getDelegate().setFontItalic(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontPointSize(int)
	 */
	@Override
	public void setFontPointSize(int size) {
		try {
			getDelegate().setFontPointSize(size);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontStrikethrough(boolean)
	 */
	@Override
	public void setFontStrikethrough(boolean flag) {
		try {
			getDelegate().setFontStrikethrough(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontStyle(int)
	 */
	@Override
	public void setFontStyle(int style) {
		try {
			getDelegate().setFontStyle(style);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFontUnderline(boolean)
	 */
	@Override
	public void setFontUnderline(boolean flag) {
		try {
			getDelegate().setFontUnderline(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setFormula(java.lang.String)
	 */
	@Override
	public void setFormula(String formula) {
		try {
			getDelegate().setFormula(formula);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderAlignment(int)
	 */
	@Override
	public void setHeaderAlignment(int alignment) {
		try {
			getDelegate().setHeaderAlignment(alignment);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontBold(boolean)
	 */
	@Override
	public void setHeaderFontBold(boolean flag) {
		try {
			getDelegate().setHeaderFontBold(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontColor(int)
	 */
	@Override
	public void setHeaderFontColor(int color) {
		try {
			getDelegate().setHeaderFontColor(color);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontFace(java.lang.String)
	 */
	@Override
	public void setHeaderFontFace(String face) {
		try {
			getDelegate().setHeaderFontFace(face);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontItalic(boolean)
	 */
	@Override
	public void setHeaderFontItalic(boolean flag) {
		try {
			getDelegate().setHeaderFontItalic(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontPointSize(int)
	 */
	@Override
	public void setHeaderFontPointSize(int size) {
		try {
			getDelegate().setHeaderFontPointSize(size);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontStrikethrough(boolean)
	 */
	@Override
	public void setHeaderFontStrikethrough(boolean flag) {
		try {
			getDelegate().setHeaderFontStrikethrough(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontStyle(int)
	 */
	@Override
	public void setHeaderFontStyle(int style) {
		try {
			getDelegate().setHeaderFontStyle(style);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHeaderFontUnderline(boolean)
	 */
	@Override
	public void setHeaderFontUnderline(boolean flag) {
		try {
			getDelegate().setHeaderFontUnderline(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHidden(boolean)
	 */
	@Override
	public void setHidden(boolean flag) {
		try {
			getDelegate().setHidden(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHideDetail(boolean)
	 */
	@Override
	public void setHideDetail(boolean flag) {
		try {
			getDelegate().setHideDetail(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setHideFormula(boolean)
	 */
	@Override
	public void setHideFormula(boolean flag) {
		try {
			getDelegate().setHideFormula(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setListSep(int)
	 */
	@Override
	public void setListSep(int separator) {
		try {
			getDelegate().setListSep(separator);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberAttrib(int)
	 */
	@Override
	public void setNumberAttrib(int attributes) {
		try {
			getDelegate().setNumberAttrib(attributes);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberAttribParens(boolean)
	 */
	@Override
	public void setNumberAttribParens(boolean flag) {
		try {
			getDelegate().setNumberAttribParens(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberAttribPercent(boolean)
	 */
	@Override
	public void setNumberAttribPercent(boolean flag) {
		try {
			getDelegate().setNumberAttribPercent(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberAttribPunctuated(boolean)
	 */
	@Override
	public void setNumberAttribPunctuated(boolean flag) {
		try {
			getDelegate().setNumberAttribPunctuated(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberDigits(int)
	 */
	@Override
	public void setNumberDigits(int digits) {
		try {
			getDelegate().setNumberDigits(digits);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setNumberFormat(int)
	 */
	@Override
	public void setNumberFormat(int format) {
		try {
			getDelegate().setNumberFormat(format);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setPosition(int)
	 */
	@Override
	public void setPosition(int position) {
		try {
			getDelegate().setPosition(position);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setResize(boolean)
	 */
	@Override
	public void setResize(boolean flag) {
		try {
			getDelegate().setResize(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setResortAscending(boolean)
	 */
	@Override
	public void setResortAscending(boolean flag) {
		try {
			getDelegate().setResortAscending(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setResortDescending(boolean)
	 */
	@Override
	public void setResortDescending(boolean flag) {
		try {
			getDelegate().setResortDescending(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setResortToView(boolean)
	 */
	@Override
	public void setResortToView(boolean flag) {
		try {
			getDelegate().setResortToView(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setResortToViewName(java.lang.String)
	 */
	@Override
	public void setResortToViewName(String name) {
		try {
			getDelegate().setResortToViewName(name);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setSecondaryResort(boolean)
	 */
	@Override
	public void setSecondaryResort(boolean flag) {
		try {
			getDelegate().setSecondaryResort(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setSecondaryResortColumnIndex(int)
	 */
	@Override
	public void setSecondaryResortColumnIndex(int index) {
		try {
			getDelegate().setSecondaryResortColumnIndex(index);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setSecondaryResortDescending(boolean)
	 */
	@Override
	public void setSecondaryResortDescending(boolean flag) {
		try {
			getDelegate().setSecondaryResortDescending(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setShowTwistie(boolean)
	 */
	@Override
	public void setShowTwistie(boolean flag) {
		try {
			getDelegate().setShowTwistie(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setSortDescending(boolean)
	 */
	@Override
	public void setSortDescending(boolean flag) {
		try {
			getDelegate().setSortDescending(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setSorted(boolean)
	 */
	@Override
	public void setSorted(boolean flag) {
		try {
			getDelegate().setSorted(flag);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setTimeDateFmt(int)
	 */
	@Override
	public void setTimeDateFmt(int format) {
		try {
			getDelegate().setTimeDateFmt(format);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setTimeFmt(int)
	 */
	@Override
	public void setTimeFmt(int format) {
		try {
			getDelegate().setTimeFmt(format);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setTimeZoneFmt(int)
	 */
	@Override
	public void setTimeZoneFmt(int format) {
		try {
			getDelegate().setTimeZoneFmt(format);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		try {
			getDelegate().setTitle(title);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.ViewColumn#setWidth(int)
	 */
	@Override
	public void setWidth(int width) {
		try {
			getDelegate().setWidth(width);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}
}