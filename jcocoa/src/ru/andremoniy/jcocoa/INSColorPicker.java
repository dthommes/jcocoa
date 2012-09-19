package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSColorPanel;
import static ns.NSColorPanel.*;
import ns.INSColorPanel;
import static ns.INSColorPanel.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;
import ns.NSButtonCell;
import static ns.NSButtonCell.*;
import ns.INSButtonCell;
import static ns.INSButtonCell.*;
import ns.NSColorList;
import static ns.NSColorList.*;
import ns.INSColorList;
import static ns.INSColorList.*;

import ns.NSObject;

public abstract class INSColorPicker extends NSObject {

	protected NSObject _imageObject;
	protected NSColorPanel _colorPanel;
	protected String _buttonToolTip;

	public NSObject initWithPickerMask(Integer mask, NSColorPanel owningColorPanel) { return null;
};
	public NSColorPanel colorPanel() { return null;
};
	public NSImage provideNewButtonImage() { return null;
};
	public void insertNewButtonImage(NSImage newButtonImage, NSButtonCell buttonCell) { return ;
};
	public void viewSizeChanged(NSObject sender) { return ;
};
	public void attachColorList(NSColorList colorList) { return ;
};
	public void detachColorList(NSColorList colorList) { return ;
};
	public void setMode(NSColorPanelMode mode) { return ;
};
	public String buttonToolTip() { return null;
};
	public NSSize minContentSize() { return null;
};
}
