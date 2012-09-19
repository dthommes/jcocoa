package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSUserDefaultsController;
import static ns.NSUserDefaultsController.*;
import ns.INSUserDefaultsController;
import static ns.INSUserDefaultsController.*;
import ns.NSMutableDictionary;
import static ns.NSMutableDictionary.*;
import ns.INSMutableDictionary;
import static ns.INSMutableDictionary.*;

import ns.NSObject;

public abstract class INSUserDefaultsControllerProxy extends NSObject {

	protected NSUserDefaultsController _controller;
	protected NSMutableDictionary _cachedValues;

	public NSObject initWithController(NSUserDefaultsController controller) { return null;
};
	public void save() { return ;
};
	public void revert() { return ;
};
	public void revertToInitialValues() { return ;
};
	public Boolean hasUnappliedChanges() { return null;
};
}
