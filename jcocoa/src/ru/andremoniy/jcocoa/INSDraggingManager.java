package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSWindow;
import static ns.NSWindow.*;
import ns.INSWindow;
import static ns.INSWindow.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;
import ns.NSEvent;
import static ns.NSEvent.*;
import ns.INSEvent;
import static ns.INSEvent.*;
import ns.NSPasteboard;
import static ns.NSPasteboard.*;
import ns.INSPasteboard;
import static ns.INSPasteboard.*;

import ns.NSObject;

public abstract class INSDraggingManager extends NSObject {
	public void registerWindow(NSWindow window, NSArray types) { return ;
};
	public void unregisterWindow(NSWindow window) { return ;
};
	public NSObject localDraggingSource() { return null;
};
	public void dragImage(NSImage image, NSPoint location, NSSize offset, NSEvent event, NSPasteboard pasteboard, NSObject source, Boolean slideBack) { return ;
};
}
