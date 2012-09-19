package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSMutableArray;

public abstract class INSKVCMutableArray extends NSMutableArray {

	protected NSObject proxyObject;
	protected NSObject key;
	protected IMP insert;
	protected IMP remove;
	protected IMP replace;
	protected IMP objectAtIndex;
	protected IMP count;
	protected IMP accessor;
	protected IMP setter;
	protected SEL insertSel;
	protected SEL removeSel;
	protected SEL replaceSel;
	protected SEL objectAtIndexSel;
	protected SEL countSel;
	protected SEL accessorSel;
	protected SEL setterSel;

	public NSObject initWithKey(NSObject theKey, NSObject object) { return null;
};
	public Integer count() { return null;
};
	public NSObject objectAtIndex(Integer index) { return null;
};
	public void addObject(NSObject anObject) { return ;
};
	public void insertObject(NSObject anObject, Integer index) { return ;
};
	public void removeLastObject() { return ;
};
	public void removeObjectAtIndex(Integer index) { return ;
};
	public void replaceObjectAtIndex(Integer index, NSObject anObject) { return ;
};
}
