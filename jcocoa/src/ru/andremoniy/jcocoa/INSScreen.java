package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSColorSpace;
import static ns.NSColorSpace.*;
import ns.INSColorSpace;
import static ns.INSColorSpace.*;

import ns.NSObject;

public abstract class INSScreen extends NSObject {

	protected NSRect _frame;
	protected NSWindowDepth _depth;
	protected int _screenNumber;
	protected NSObject _auxiliaryStorage;

	public NSWindowDepth depth() { return null;
};
	public NSRect frame() { return null;
};
	public NSRect visibleFrame() { return null;
};
	public NSDictionary deviceDescription() { return null;
};
	public NSColorSpace colorSpace() { return null;
};
	public NSWindowDepth supportedWindowDepths() { return null;
};
}
