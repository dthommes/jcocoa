package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSCell {
	public Integer entryType() { return null;
};
	public void setEntryType(Integer aType) { return ;
};
	public void setFloatingPointFormat(Boolean autoRange, Integer leftDigits, Integer rightDigits) { return ;
};
public static Integer NSAnyType = 0;
public static Integer NSIntType = 1;
public static Integer NSPositiveIntType = 2;
public static Integer NSFloatType = 3;
public static Integer NSPositiveFloatType = 4;
public static Integer NSDoubleType = 6;
public static Integer NSPositiveDoubleType = 7;
public static Integer NSNullCellType = 0;
public static Integer NSTextCellType = 1;
public static Integer NSImageCellType = 2;

	public static class NSCellType extends NSUInteger { }public static Integer NSCellDisabled = 0;
public static Integer NSCellState = 1;
public static Integer NSPushInCell = 2;
public static Integer NSCellEditable = 3;
public static Integer NSChangeGrayCell = 4;
public static Integer NSCellHighlighted = 5;
public static Integer NSCellLightsByContents = 6;
public static Integer NSCellLightsByGray = 7;
public static Integer NSChangeBackgroundCell = 8;
public static Integer NSCellLightsByBackground = 9;
public static Integer NSCellIsBordered = 10;
public static Integer NSCellHasOverlappingImage = 11;
public static Integer NSCellHasImageHorizontal = 12;
public static Integer NSCellHasImageOnLeftOrBottom = 13;
public static Integer NSCellChangesContents = 14;
public static Integer NSCellIsInsetButton = 15;
public static Integer NSCellAllowsMixedState = 16;

	public static class NSCellAttribute extends NSUInteger { }public static Integer NSNoImage = 0;
public static Integer NSImageOnly = 1;
public static Integer NSImageLeft = 2;
public static Integer NSImageRight = 3;
public static Integer NSImageBelow = 4;
public static Integer NSImageAbove = 5;
public static Integer NSImageOverlaps = 6;

	public static class NSCellImagePosition extends NSUInteger { }
	public static class NSImageScaling extends NSUInteger { }public static Integer NSMixedState = -1;
public static Integer NSOffState = 0;
public static Integer NSOnState = 1;

	public static class NSCellStateValue extends NSInteger { }public static Integer NSNoCellMask = 0;
public static Integer NSContentsCellMask = 1;
public static Integer NSPushInCellMask = 2;
public static Integer NSChangeGrayCellMask = 4;
public static Integer NSChangeBackgroundCellMask = 8;
public static Integer NSDefaultControlTint = 0;
public static Integer NSClearControlTint = 7;

	public static class NSControlTint extends NSUInteger { }public static Integer NSRegularControlSize = null;
public static Integer NSSmallControlSize = null;

	public static class NSControlSize extends NSUInteger { }
	public static class _CFlags {
		Integer state;
		Integer highlighted;
		Integer disabled;
		Integer editable;
		NSCellType type;
		Integer vCentered;
		Integer hCentered;
		Integer bordered;
		Integer bezeled;
		Integer selectable;
		Integer scrollable;
		Integer continuous;
		Integer actOnMouseDown;
		Integer isLeaf;
		Integer invalidObjectValue;
		Integer invalidFont;
		NSLineBreakMode lineBreakMode;
		Integer cellReserved1;
		Integer singleLineMode;
		Integer actOnMouseDragged;
		Integer isLoaded;
		Integer truncateLastLine;
		Integer dontActOnMouseUp;
		Integer isWhite;
		Integer useUserKeyEquivalent;
		Integer showsFirstResponder;
		Integer focusRingType;
		Integer wasSelectable;
		Integer hasInvalidObject;
		Integer allowsEditingTextAttributes;
		Integer importsGraphics;
		NSTextAlignment alignment;
		Integer layoutDirectionRTL;
		Integer backgroundStyle;
		Integer cellReserved2;
		Integer refusesFirstResponder;
		Integer needsHighlightedText;
		Integer dontAllowsUndo;
		Integer currentlyEditing;
		Integer allowsMixedState;
		Integer inMixedState;
		Integer sendsActionOnEndEditing;
		Integer inSendAction;
		Integer menuWasSet;
		Integer controlTint;
		Integer controlSize;
		Integer branchImageDisabled;
		Integer drawingInRevealover;
		Integer needsHighlightedTextHint;
	}
	public static String NSControlTintDidChangeNotification;
	public static Boolean NSDrawThreePartImage;
	public static Boolean NSDrawNinePartImage;
}
