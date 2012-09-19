package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSPersistentStore;
import static ns.NSPersistentStore.*;
import ns.INSPersistentStore;
import static ns.INSPersistentStore.*;
import ns.NSManagedObjectID;
import static ns.NSManagedObjectID.*;
import ns.INSManagedObjectID;
import static ns.INSManagedObjectID.*;
import ns.NSManagedObject;
import static ns.NSManagedObject.*;
import ns.INSManagedObject;
import static ns.INSManagedObject.*;

public abstract class INSPersistentStoreCoordinator {
	public NSPersistentStore _persistentStoreWithIdentifier(String identifier) { return null;
};
	public NSPersistentStore _persistentStoreForObjectID(NSManagedObjectID object) { return null;
};
	public NSPersistentStore _persistentStoreForObject(NSManagedObject object) { return null;
};
}
