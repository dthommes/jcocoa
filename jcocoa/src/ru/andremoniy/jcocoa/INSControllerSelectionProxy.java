package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSMutableDictionary;
import static ns.NSMutableDictionary.*;
import ns.INSMutableDictionary;
import static ns.INSMutableDictionary.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;

import ns.NSObject;

public abstract class INSControllerSelectionProxy extends NSObject {

	protected NSObject _controller;
	protected NSMutableDictionary _cachedValues;
	protected NSObject _observableSelection;
	protected NSMutableArray _observationProxies;
	protected NSObject _cachedKeysForKVO;
	protected Integer _respondingToSelectionChanges;

	public NSObject initWithController(NSObject cont) { return null;
};
	public void controllerWillChange() { return ;
};
	public void controllerDidChange() { return ;
};
}
