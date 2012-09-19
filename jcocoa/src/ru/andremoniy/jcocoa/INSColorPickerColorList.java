package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSBrowser;
import static ns.NSBrowser.*;
import ns.INSBrowser;
import static ns.INSBrowser.*;
import ns.NSPopUpButton;
import static ns.NSPopUpButton.*;
import ns.INSPopUpButton;
import static ns.INSPopUpButton.*;
import ns.NSColorList;
import static ns.NSColorList.*;
import ns.INSColorList;
import static ns.INSColorList.*;

import ns.NSColorPicker;

public abstract class INSColorPickerColorList extends NSColorPicker {

	protected NSBrowser colorBrowser;
	protected NSPopUpButton colorListPopUp;
	protected NSColorList _pickedColorList;

	public void colorListPopUpClicked(NSObject sender) { return ;
};
	public void colorListBrowserClicked(NSObject sender) { return ;
};
}
