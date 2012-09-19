package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSWindow;
import static ns.NSWindow.*;
import ns.INSWindow;
import static ns.INSWindow.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSEvent;
import static ns.NSEvent.*;
import ns.INSEvent;
import static ns.INSEvent.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSModalSessionX extends NSObject {

	protected NSWindow _window;
	protected NSMutableArray _unprocessedEvents;
	protected int _stopCode;

	public void stopModalWithCode(int code) { return ;
};
	public NSWindow modalWindow() { return null;
};
	public int stopCode() { return null;
};
	public void addUnprocessedEvent(NSEvent event) { return ;
};
	public NSArray unprocessedEvents() { return null;
};
}
