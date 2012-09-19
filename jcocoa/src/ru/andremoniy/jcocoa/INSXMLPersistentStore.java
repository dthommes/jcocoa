package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSMutableDictionary;
import static ns.NSMutableDictionary.*;
import ns.INSMutableDictionary;
import static ns.INSMutableDictionary.*;
import ns.NSMutableSet;
import static ns.NSMutableSet.*;
import ns.INSMutableSet;
import static ns.INSMutableSet.*;

import ns.NSAtomicStore;

public abstract class INSXMLPersistentStore extends NSAtomicStore {

	protected XMLDocument _document;
	protected NSMutableDictionary _referenceToCacheNode;
	protected NSMutableDictionary _referenceToElement;
	protected NSMutableSet _usedReferences;

}
