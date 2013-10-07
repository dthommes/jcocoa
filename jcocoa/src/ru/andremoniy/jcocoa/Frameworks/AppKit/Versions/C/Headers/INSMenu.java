package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSMenu.*;

public abstract class INSMenu {
	public void setMenuRepresentation(NSObject menuRep) { return ;
};
	public NSObject menuRepresentation() { return null;
};
	public void setContextMenuRepresentation(NSObject menuRep) { return ;
};
	public NSObject contextMenuRepresentation() { return null;
};
	public void setTearOffMenuRepresentation(NSObject menuRep) { return ;
};
	public NSObject tearOffMenuRepresentation() { return null;
};
	public NSMenu attachedMenu() { return null;
};
	public Boolean isAttached() { return null;
};
	public void sizeToFit() { return ;
};
	public NSPoint locationForSubmenu(NSMenu aSubmenu) { return null;
};
	public abstract class NSMenuDelegate {
	
}
public static Integer NSMenuPropertyItemTitle = 1;
public static Integer NSMenuPropertyItemAttributedTitle = 1;
public static Integer NSMenuPropertyItemKeyEquivalent = 1;
public static Integer NSMenuPropertyItemImage = 1;
public static Integer NSMenuPropertyItemEnabled = 1;
public static Integer NSMenuPropertyItemAccessibilityDescription = 1;

	public static class NSMenuProperties extends NSUInteger { }	public static String NSMenuWillSendActionNotification;
	public static String NSMenuDidSendActionNotification;
	public static String NSMenuDidAddItemNotification;
	public static String NSMenuDidRemoveItemNotification;
	public static String NSMenuDidChangeItemNotification;
	public static String NSMenuDidBeginTrackingNotification;
	public static String NSMenuDidEndTrackingNotification;
public abstract static class INSObject {
	public Boolean validateMenuItem(NSMenuItem menuItem) { return null;
};

}
}
