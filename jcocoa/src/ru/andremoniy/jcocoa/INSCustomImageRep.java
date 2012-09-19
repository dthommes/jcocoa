package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSImageRep;

public abstract class INSCustomImageRep extends NSImageRep {

	protected SEL _drawMethod;
	protected NSObject _drawObject;
	protected int _reserved;

	public NSObject initWithDrawSelector(SEL aMethod, NSObject anObject) { return null;
};
	public SEL drawSelector() { return null;
};
	public NSObject delegate() { return null;
};
}
