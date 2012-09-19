package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSDrawer;
import static ns.NSDrawer.*;
import ns.INSDrawer;
import static ns.INSDrawer.*;

import ns.NSPanel;

public abstract class INSDrawerWindow extends NSPanel {
public static Integer NSDrawerWindowMask = 1;

	protected NSDrawer _drawer;

	public NSDrawer drawer() { return null;
};
	public void setDrawer(NSDrawer drawer) { return ;
};
}
