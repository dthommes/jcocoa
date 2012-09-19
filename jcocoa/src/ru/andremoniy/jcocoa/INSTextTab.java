package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSObject;

public abstract class INSTextTab extends NSObject {

	public enum NSTextTabType {
		NSLeftTabStopType,
		NSRightTabStopType,
		NSCenterTabStopType,
		NSDecimalTabStopType
	}

	protected NSTextTabType _type;
	protected double _location;

	public  () { return null;
};
	public NSTextTabType tabStopType() { return null;
};
	public double location() { return null;
};
}
