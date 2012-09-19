package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSImageView;
import static ns.NSImageView.*;
import ns.INSImageView;
import static ns.INSImageView.*;
import ns.NSTextField;
import static ns.NSTextField.*;
import ns.INSTextField;
import static ns.INSTextField.*;
import ns.NSScrollView;
import static ns.NSScrollView.*;
import ns.INSScrollView;
import static ns.INSScrollView.*;
import ns.NSTextView;
import static ns.NSTextView.*;
import ns.INSTextView;
import static ns.INSTextView.*;
import ns.NSPanel;
import static ns.NSPanel.*;
import ns.INSPanel;
import static ns.INSPanel.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSObject;

public abstract class INSSystemInfoPanel extends NSObject {

	protected NSImageView appIconView;
	protected NSTextField appNameField;
	protected NSScrollView creditScrollView;
	protected NSTextView creditView;
	protected NSPanel infoPanel;
	protected NSTextField legalTextField;
	protected NSTextField versionField;

	public void showInfoPanel(NSObject sender) { return ;
};
	public void showInfoPanel(NSObject sender, NSDictionary options) { return ;
};
	public void _resetInfoPanel() { return ;
};
}
