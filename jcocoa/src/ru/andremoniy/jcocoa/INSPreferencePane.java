package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSWindow;
import static ns.NSWindow.*;
import ns.INSWindow;
import static ns.INSWindow.*;
import ns.NSView;
import static ns.NSView.*;
import ns.INSView;
import static ns.INSView.*;
import ns.NSBundle;
import static ns.NSBundle.*;
import ns.INSBundle;
import static ns.INSBundle.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSPreferencePane extends NSObject {

	public enum NSPreferencePaneUnselectReply {
		NSUnselectCancel,
		NSUnselectNow,
		NSUnselectLater
	}
	public static String NSPreferencePaneDoUnselectNotification;
	public static String NSPreferencePaneCancelUnselectNotification;

	protected NSWindow _window;
	protected NSView _initialKeyView;
	protected NSView _firstKeyView;
	protected NSView _lastKeyView;
	protected NSView _mainView;
	protected NSBundle _bundle;
	protected NSObject _reserved1;
	protected NSObject _reserved2;
	protected NSObject _reserved3;

	public NSObject initWithBundle(NSBundle bundle) { return null;
};
	public NSBundle bundle() { return null;
};
	public NSView loadMainView() { return null;
};
	public void mainViewDidLoad() { return ;
};
	public String mainNibName() { return null;
};
	public void assignMainView() { return ;
};
	public void willSelect() { return ;
};
	public void didSelect() { return ;
};
	public NSPreferencePaneUnselectReply shouldUnselect() { return null;
};
	public void replyToShouldUnselect(Boolean shouldUnselect) { return ;
};
	public void willUnselect() { return ;
};
	public void didUnselect() { return ;
};
	public void setMainView(NSView view) { return ;
};
	public NSView mainView() { return null;
};
	public NSView initialKeyView() { return null;
};
	public void setInitialKeyView(NSView view) { return ;
};
	public NSView firstKeyView() { return null;
};
	public void setFirstKeyView(NSView view) { return ;
};
	public NSView lastKeyView() { return null;
};
	public void setLastKeyView(NSView view) { return ;
};
	public Boolean autoSaveTextFields() { return null;
};
	public Boolean isSelected() { return null;
};
	public void updateHelpMenuWithArray(NSArray inArrayOfMenuItems) { return ;
};
}
