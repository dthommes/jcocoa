package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.*;

public abstract class INSDragging {

	public static class NSDragOperation extends NSUInteger { }public static Integer NSDragOperationNone = 0;
public static Integer NSDragOperationCopy = 1;
public static Integer NSDragOperationLink = 2;
public static Integer NSDragOperationGeneric = 4;
public static Integer NSDragOperationPrivate = 8;
public static Integer NSDragOperationAll_Obsolete = 15;
public static Integer NSDragOperationMove = 16;
public static Integer NSDragOperationDelete = 32;
public static Integer NSDragOperationEvery = 0;
	public abstract class NSDraggingInfo {
	public NSWindow draggingDestinationWindow() { return null;
};
	public NSDragOperation draggingSourceOperationMask() { return null;
};
	public NSPoint draggingLocation() { return null;
};
	public NSPoint draggedImageLocation() { return null;
};
	public NSImage draggedImage() { return null;
};
	public NSPasteboard draggingPasteboard() { return null;
};
	public NSObject draggingSource() { return null;
};
	public Integer draggingSequenceNumber() { return null;
};
	public void slideDraggedImageTo(NSPoint screenPoint) { return ;
};
	
}
public abstract static class INSObject {
	public NSDragOperation draggingEntered(NSObject sender) { return null;
};
	public NSDragOperation draggingUpdated(NSObject sender) { return null;
};
	public void draggingExited(NSObject sender) { return ;
};
	public Boolean prepareForDragOperation(NSObject sender) { return null;
};
	public Boolean performDragOperation(NSObject sender) { return null;
};
	public void concludeDragOperation(NSObject sender) { return ;
};
	public void draggingEnded(NSObject sender) { return ;
};

}
public abstract static class INSObject {
	public NSDragOperation draggingSourceOperationMaskForLocal(Boolean flag) { return null;
};
	public void draggedImage(NSImage image, NSPoint screenPoint) { return ;
};
	public void draggedImage(NSImage image, NSPoint screenPoint, NSDragOperation operation) { return ;
};
	public void draggedImage(NSImage image, NSPoint screenPoint) { return ;
};
	public Boolean ignoreModifierKeysWhileDragging() { return null;
};

}
public abstract static class INSObject {
	public void draggedImage(NSImage image, NSPoint screenPoint, Boolean flag) { return ;
};

}
}
