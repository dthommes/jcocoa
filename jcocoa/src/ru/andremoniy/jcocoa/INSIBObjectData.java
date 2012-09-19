package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSCustomObject;
import static ns.NSCustomObject.*;
import ns.INSCustomObject;
import static ns.INSCustomObject.*;
import ns.NSSet;
import static ns.NSSet.*;
import ns.INSSet;
import static ns.INSSet.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSMenu;
import static ns.NSMenu.*;
import ns.INSMenu;
import static ns.INSMenu.*;

import ns.NSObject;

public abstract class INSIBObjectData extends NSObject {

	protected NSArray _namesKeys;
	protected NSArray _namesValues;
	protected NSArray _accessibilityConnectors;
	protected NSArray _accessibilityOidsKeys;
	protected NSArray _accessibilityOidsValues;
	protected NSArray _classesKeys;
	protected NSArray _classesValues;
	protected NSArray _connections;
	protected NSObject _fontManager;
	protected String _framework;
	protected int _nextOid;
	protected NSArray _objectsKeys;
	protected NSArray _objectsValues;
	protected NSArray _oidKeys;
	protected NSArray _oidValues;
	protected NSCustomObject _fileOwner;
	protected NSSet _visibleWindows;

	public void buildConnectionsWithNameTable(NSDictionary nameTable) { return ;
};
	public NSSet visibleWindows() { return null;
};
	public NSMenu mainMenu() { return null;
};
	public NSArray topLevelObjects() { return null;
};
}
