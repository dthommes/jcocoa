package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

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
