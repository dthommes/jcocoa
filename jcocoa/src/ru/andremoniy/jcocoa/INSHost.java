package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSHost;
import static ns.NSHost.*;
import ns.INSHost;
import static ns.INSHost.*;

import ns.NSObject;

public abstract class INSHost extends NSObject {

	protected NSArray names;
	protected NSArray addresses;
	protected void reserved;

	public Boolean isEqualToHost(NSHost aHost) { return null;
};
	public String name() { return null;
};
	public NSArray names() { return null;
};
	public String address() { return null;
};
	public NSArray addresses() { return null;
};
	public String localizedName() { return null;
};
}
