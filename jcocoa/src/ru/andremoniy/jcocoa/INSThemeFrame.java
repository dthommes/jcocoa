package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSView;

public abstract class INSThemeFrame extends NSView {

	public enum NSWindowBorderType {
		NSWindowNoBorderType,
		NSWindowSheetBorderType,
		NSWindowToolTipBorderType
	}

	protected NSWindowBorderType _borderType;

	public NSWindowBorderType windowBorderType() { return null;
};
	public void setWindowBorderType(NSWindowBorderType borderType) { return ;
};
}
