package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSStatusItem;
import static ns.NSStatusItem.*;
import ns.INSStatusItem;
import static ns.INSStatusItem.*;

import ns.NSObject;

public abstract class INSStatusBar extends NSObject {

	protected NSObject _items;
	protected void _fReserved1;
	protected void _fReserved2;
	protected Integer _registeredForNote;

	public NSStatusItem statusItemWithLength(Double length) { return null;
};
	public void removeStatusItem(NSStatusItem item) { return ;
};
	public Boolean isVertical() { return null;
};
	public Double thickness() { return null;
};
}
