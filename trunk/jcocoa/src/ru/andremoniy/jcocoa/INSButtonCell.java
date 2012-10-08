package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;


public abstract class INSButtonCell extends NSActionCell {
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
	public static class  {
		int alternateMnemonicLocation;
		int useButtonImageSource;
		int reserved;
		int suppressAXValueChangeNote;
		int doesNotDimImage;
		int inset;
		int transparent;
		int lastState;
		int hasKeyEquivalentInsteadOfImage;
		int imageSizeDiff;
		int imageAndText;
		int bottomOrLeft;
		int horizontal;
		int imageOverlaps;
		int bordered;
		int drawing;
		int lightByGray;
		int lightByBackground;
		int lightByContents;
		int changeGray;
		int changeBackground;
		int changeContents;
		int pushIn;
	}

	public static class  {
		int bezelStyle;
		int showsBorderOnlyWhileMouseInside;
		int mouseInside;
		int bezelStyle2;
		int imageScaling;
		int keyEquivalentModifierMask;
	}

	protected String _altContents;
	protected NSObject _sound;
	protected String _keyEquivalent;
	protected _BCFlags2 _bcFlags2;
	protected short _periodicDelay;
	protected short _periodicInterval;
	protected _BCFlags _bcFlags;
	protected NSImage _normalImage;
	protected NSObject _alternateImageOrKeyEquivalentFont;

	public String title() { return null;
};
	public void setTitle(String aString) { return ;
};
	public String alternateTitle() { return null;
};
	public void setAlternateTitle(String aString) { return ;
};
	public NSImage alternateImage() { return null;
};
	public void setAlternateImage(NSImage image) { return ;
};
	public NSCellImagePosition imagePosition() { return null;
};
	public void setImagePosition(NSCellImagePosition aPosition) { return ;
};
	public Integer highlightsBy() { return null;
};
	public void setHighlightsBy(Integer aType) { return ;
};
	public Integer showsStateBy() { return null;
};
	public void setShowsStateBy(Integer aType) { return ;
};
	public void setButtonType(NSButtonType aType) { return ;
};
	public Boolean isOpaque() { return null;
};
	public void setFont(NSFont fontObj) { return ;
};
	public Boolean isTransparent() { return null;
};
	public void setTransparent(Boolean flag) { return ;
};
	public void setPeriodicDelay(double delay, double interval) { return ;
};
	public void getPeriodicDelay(double delay, double interval) { return ;
};
	public String keyEquivalent() { return null;
};
	public void setKeyEquivalent(String aKeyEquivalent) { return ;
};
	public Integer keyEquivalentModifierMask() { return null;
};
	public void setKeyEquivalentModifierMask(Integer mask) { return ;
};
	public NSFont keyEquivalentFont() { return null;
};
	public void setKeyEquivalentFont(NSFont fontObj) { return ;
};
	public void setKeyEquivalentFont(String fontName, Double fontSize) { return ;
};
	public void performClick(NSObject sender) { return ;
};
	public void setTitleWithMnemonic(String stringWithAmpersand) { return ;
};
	public void setAlternateTitleWithMnemonic(String stringWithAmpersand) { return ;
};
	public void setAlternateMnemonicLocation(Integer location) { return ;
};
	public Integer alternateMnemonicLocation() { return null;
};
	public String alternateMnemonic() { return null;
};
public static Integer NSGradientNone = 0;
public static Integer NSGradientConcaveWeak = 1;
public static Integer NSGradientConcaveStrong = 2;
public static Integer NSGradientConvexWeak = 3;
public static Integer NSGradientConvexStrong = 4;

	public static class NSGradientType extends NSUInteger { }	public NSGradientType gradientType() { return null;
};
	public void setGradientType(NSGradientType type) { return ;
};
	public void setImageDimsWhenDisabled(Boolean flag) { return ;
};
	public Boolean imageDimsWhenDisabled() { return null;
};
	public void setShowsBorderOnlyWhileMouseInside(Boolean show) { return ;
};
	public Boolean showsBorderOnlyWhileMouseInside() { return null;
};
	public void mouseEntered(NSEvent event) { return ;
};
	public void mouseExited(NSEvent event) { return ;
};
	public NSAttributedString attributedTitle() { return null;
};
	public void setAttributedTitle(NSAttributedString obj) { return ;
};
	public NSAttributedString attributedAlternateTitle() { return null;
};
	public void setAttributedAlternateTitle(NSAttributedString obj) { return ;
};
	public void setBezelStyle(NSBezelStyle bezelStyle) { return ;
};
	public NSBezelStyle bezelStyle() { return null;
};
	public void setSound(NSSound aSound) { return ;
};
	public NSSound sound() { return null;
};
}