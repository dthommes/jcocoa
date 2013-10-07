package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorList.*;

public abstract class INSColorPanel extends NSPanel {

	protected NSObject _colorSwatch;
	protected NSObject _reserved1;
	protected NSObject _colorWell;
	protected NSMutableArray _pickersWithLoadedViews;
	protected NSObject _magnifyButton;
	protected NSObject _middleView;
	protected NSObject _opacitySlider;
	protected NSObject _opacityText;
	protected NSObject _opacityView;
	protected NSObject _modalButtons;
	protected NSObject _pickerView;
	protected NSObject _customViewsList;
	protected NSObject _customPickerList;
	protected NSObject _currViewObject;
	protected NSObject _boxAboveSwatch;
	protected NSObject _target;
	protected NSObject _accessoryView;
	protected SEL _action;
	protected NSSize _minColorPanelSize;
	protected NSSize _maxColorPanelSize;
	protected NSSize _reserved2;
	protected NSSize _reserved3;
	protected NSObject _resizeDimple;
	protected Boolean _reserved5;
	protected Boolean _reserved6;
	protected Boolean _handlingOpacityMoveAction;
	protected Boolean _ignoreConstraints;
	protected Boolean _continuous;
	protected Boolean _allowColorSetting;
	protected Boolean _stillInitializing;
	protected NSObject _opacityTextController;

	public void setAccessoryView(NSView aView) { return ;
};
	public NSView accessoryView() { return null;
};
	public void setContinuous(Boolean flag) { return ;
};
	public Boolean isContinuous() { return null;
};
	public void setShowsAlpha(Boolean flag) { return ;
};
	public Boolean showsAlpha() { return null;
};
	public void setMode(NSColorPanelMode mode) { return ;
};
	public NSColorPanelMode mode() { return null;
};
	public void setColor(NSColor color) { return ;
};
	public NSColor color() { return null;
};
	public Double alpha() { return null;
};
	public void setAction(SEL aSelector) { return ;
};
	public void setTarget(NSObject anObject) { return ;
};
	public void attachColorList(NSColorList colorList) { return ;
};
	public void detachColorList(NSColorList colorList) { return ;
};

	public static class NSColorPanelMode extends NSInteger { }public static Integer NSGrayModeColorPanel = 0;
public static Integer NSRGBModeColorPanel = 1;
public static Integer NSCMYKModeColorPanel = 2;
public static Integer NSHSBModeColorPanel = 3;
public static Integer NSCustomPaletteModeColorPanel = 4;
public static Integer NSColorListModeColorPanel = 5;
public static Integer NSWheelModeColorPanel = 6;
public static Integer NSColorPanelGrayModeMask = 0x00000001;
public static Integer NSColorPanelRGBModeMask = 0x00000002;
public static Integer NSColorPanelCMYKModeMask = 0x00000004;
public static Integer NSColorPanelHSBModeMask = 0x00000008;
public static Integer NSColorPanelCustomPaletteModeMask = 0x00000010;
public static Integer NSColorPanelColorListModeMask = 0x00000020;
public static Integer NSColorPanelWheelModeMask = 0x00000040;
public static Integer NSColorPanelAllModesMask = 0x0000ffff;
	public static String NSColorPanelColorDidChangeNotification;
public abstract static class INSApplication {
	public void orderFrontColorPanel(NSObject sender) { return ;
};

}
public abstract static class INSObject {
	public void changeColor(NSObject sender) { return ;
};

}
}
