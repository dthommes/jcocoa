package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;

import ns.NSImageRep;

public abstract class INSPICTImageRep extends NSImageRep {

	protected NSPoint _pictOrigin;
	protected NSData _pictData;
	protected int _reserved1;
	protected int _reserved2;

	public NSObject initWithData(NSData pictData) { return null;
};
	public NSData PICTRepresentation() { return null;
};
	public NSRect boundingBox() { return null;
};
}
