package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSMapTable;
import static ns.NSMapTable.*;
import ns.INSMapTable;
import static ns.INSMapTable.*;
import ns.NSWindow;
import static ns.NSWindow.*;
import ns.INSWindow;
import static ns.INSWindow.*;
import ns.NSBundle;
import static ns.NSBundle.*;
import ns.INSBundle;
import static ns.INSBundle.*;
import ns.NSAttributedString;
import static ns.NSAttributedString.*;
import ns.INSAttributedString;
import static ns.INSAttributedString.*;

import ns.NSObject;

public abstract class INSHelpManager extends NSObject {

	protected NSMapTable _helpMapTable;
	protected NSMapTable _keyMapTable;
	protected NSMapTable _bundleMapTable;
	protected NSWindow _helpWindow;
	protected NSWindow _shadowWindow;
	protected NSWindow _evtWindow;
	protected NSBundle _helpBundle;

	public void setContextHelp(NSAttributedString attrString, NSObject object) { return ;
};
	public void removeContextHelpForObject(NSObject object) { return ;
};
	public NSAttributedString contextHelpForObject(NSObject object) { return null;
};
	public Boolean showContextHelpForObject(NSObject object, NSPoint pt) { return null;
};
	public Boolean registerBooksInBundle(NSBundle bundle) { return null;
};
	public NSAttributedString contextHelpForKey(String key) { return null;
};
	public void activateContextHelpMode(NSObject sender) { return ;
};
	public void showHelp(NSObject sender) { return ;
};
}
