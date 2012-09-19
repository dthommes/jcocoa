package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSCell;

public abstract class INSActionCell extends NSCell {

	protected Integer _tag;
	protected NSObject _target;
	protected SEL _action;
	protected NSObject _controlView;

	public NSObject target() { return null;
};
	public void setTarget(NSObject anObject) { return ;
};
	public SEL action() { return null;
};
	public void setAction(SEL aSelector) { return ;
};
	public Integer tag() { return null;
};
	public void setTag(Integer anInt) { return ;
};
}
