package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSStringDrawing.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSStringDrawing.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextAttachment.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextAttachment.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSStringDrawing.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSStringDrawing.INSAttributedString.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextAttachment.INSAttributedString;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextAttachment.INSAttributedString.*;

public abstract class INSView {
	public void showDefinitionForAttributedString(NSAttributedString attrString, NSPoint textBaselineOrigin) { return ;
};
public static Integer NSViewNotSizable = 0;
public static Integer NSViewMinXMargin = 1;
public static Integer NSViewWidthSizable = 2;
public static Integer NSViewMaxXMargin = 4;
public static Integer NSViewMinYMargin = 8;
public static Integer NSViewHeightSizable = 16;
public static Integer NSViewMaxYMargin = 32;
public static Integer NSNoBorder = 0;
public static Integer NSLineBorder = 1;
public static Integer NSBezelBorder = 2;
public static Integer NSGrooveBorder = 3;

	public static class NSBorderType extends NSUInteger { }
	public static class NSViewLayerContentsRedrawPolicy extends NSInteger { }
	public static class NSViewLayerContentsPlacement extends NSInteger { }
	public static class _VFlags {
		Integer aboutToResize;
		Integer retainCountOverMax;
		Integer retainCount;
		Integer interfaceStyle1;
		Integer specialArchiving;
		Integer needsDisplayForBounds;
		Integer interfaceStyle0;
		Integer removingWithoutInvalidation;
		Integer needsBoundsChangeNote;
		Integer boundsChangeNotesSuspended;
		Integer focusChangeNotesSuspended;
		Integer needsFrameChangeNote;
		Integer frameChangeNotesSuspended;
		Integer noVerticalAutosizing;
		Integer newGState;
		Integer validGState;
		Integer needsDisplay;
		Integer wantsGState;
		Integer autoresizeSubviews;
		Integer autosizing;
		Integer rotatedOrScaledFromBase;
		Integer rotatedFromBase;
	}

	public static class NSTrackingRectTag extends NSInteger { }
	public static class NSToolTipTag extends NSInteger { }	public static String NSViewFrameDidChangeNotification;
	public static String NSViewFocusDidChangeNotification;
	public static String NSViewBoundsDidChangeNotification;
	public static String NSViewGlobalFrameDidChangeNotification;
	public static String NSViewDidUpdateTrackingAreasNotification;
public abstract static class INSObject {
	public String view(NSView view, NSToolTipTag tag, NSPoint point, void data) { return null;
};

}
}
