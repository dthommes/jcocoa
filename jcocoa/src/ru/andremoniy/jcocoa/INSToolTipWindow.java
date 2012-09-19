package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSTextField;
import static ns.NSTextField.*;
import ns.INSTextField;
import static ns.INSTextField.*;
import ns.NSTrackingArea;
import static ns.NSTrackingArea.*;
import ns.INSTrackingArea;
import static ns.INSTrackingArea.*;

import ns.NSWindow;

public abstract class INSToolTipWindow extends NSWindow {

	protected NSTextField _textField;


	protected NSTrackingArea _trackingArea;
	protected Boolean _sizeAdjusted;

	public String toolTip() { return null;
};
	public void setToolTip(String toolTip) { return ;
};
	public NSTrackingArea _trackingArea() { return null;
};
	public void _setTrackingArea(NSTrackingArea trackingArea) { return ;
};
}
