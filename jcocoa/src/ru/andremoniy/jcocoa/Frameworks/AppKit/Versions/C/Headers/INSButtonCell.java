package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSSound;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSSound.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSSound;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSSound.*;

public abstract class INSButtonCell {
	public void setSound(NSSound aSound) { return ;
};
	public NSSound sound() { return null;
};
public static Integer NSMomentaryLightButton = 0;
public static Integer NSPushOnPushOffButton = 1;
public static Integer NSToggleButton = 2;
public static Integer NSSwitchButton = 3;
public static Integer NSRadioButton = 4;
public static Integer NSMomentaryChangeButton = 5;
public static Integer NSOnOffButton = 6;
public static Integer NSMomentaryPushInButton = 7;
public static Integer NSMomentaryPushButton = 0;
public static Integer NSMomentaryLight = 7;

	public static class NSButtonType extends NSUInteger { }public static Integer NSRoundedBezelStyle = 1;
public static Integer NSRegularSquareBezelStyle = 2;
public static Integer NSThickSquareBezelStyle = 3;
public static Integer NSThickerSquareBezelStyle = 4;
public static Integer NSShadowlessSquareBezelStyle = 6;
public static Integer NSCircularBezelStyle = 7;
public static Integer NSSmallIconButtonBezelStyle = 2;

	public static class NSBezelStyle extends NSUInteger { }
	public static class __BCFlags {
		Integer alternateMnemonicLocation;
		Integer useButtonImageSource;
		Integer reserved;
		Integer suppressAXValueChangeNote;
		Integer doesNotDimImage;
		Integer inset;
		Integer transparent;
		Integer lastState;
		Integer hasKeyEquivalentInsteadOfImage;
		Integer imageSizeDiff;
		Integer imageAndText;
		Integer bottomOrLeft;
		Integer horizontal;
		Integer imageOverlaps;
		Integer bordered;
		Integer drawing;
		Integer lightByGray;
		Integer lightByBackground;
		Integer lightByContents;
		Integer changeGray;
		Integer changeBackground;
		Integer changeContents;
		Integer pushIn;
	}

	public static class __BCFlags2 {
		Integer bezelStyle;
		Integer showsBorderOnlyWhileMouseInside;
		Integer mouseInside;
		Integer bezelStyle2;
		Integer imageScaling;
		Integer keyEquivalentModifierMask;
	}
public static Integer NSGradientNone = 0;
public static Integer NSGradientConcaveWeak = 1;
public static Integer NSGradientConcaveStrong = 2;
public static Integer NSGradientConvexWeak = 3;
public static Integer NSGradientConvexStrong = 4;

	public static class NSGradientType extends NSUInteger { }}
