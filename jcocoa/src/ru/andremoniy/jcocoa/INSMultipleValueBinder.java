package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSBinder;
import static ns.NSBinder.*;
import ns.INSBinder;
import static ns.INSBinder.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

public abstract class I_NSMultipleValueBinder extends _NSBinder {

	protected NSArray _rowValues;
	protected String _arrayKeyPath;
	protected String _valueKeyPath;
	protected Boolean _isObserving;

	public void applyToCell(NSObject cell, int row) { return ;
};
	public void applyFromCell(NSObject cell, int row) { return ;
};
	public void updateRowValues() { return ;
};
	public NSArray rowValues() { return null;
};
	public Boolean allowsEditingForRow(int row) { return null;
};
	public void cacheArrayKeyPath() { return ;
};

	protected Boolean _isObserving;

}
