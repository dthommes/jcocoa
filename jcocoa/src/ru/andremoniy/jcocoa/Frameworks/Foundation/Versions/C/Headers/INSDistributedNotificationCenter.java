package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;

public abstract class INSDistributedNotificationCenter extends NSNotificationCenter {
	public void addObserver(NSObject observer, SEL selector, String name, String object, NSNotificationSuspensionBehavior suspensionBehavior) { return ;
};
	public void postNotificationName(String name, String object, NSDictionary userInfo, Boolean deliverImmediately) { return ;
};
	public void setSuspended(Boolean suspended) { return ;
};
	public Boolean suspended() { return null;
};
	public void addObserver(NSObject observer, SEL aSelector, String aName, String anObject) { return ;
};
	public void postNotificationName(String aName, String anObject) { return ;
};
	public void postNotificationName(String aName, String anObject, NSDictionary aUserInfo) { return ;
};
	public void removeObserver(NSObject observer, String aName, String anObject) { return ;
};
	public static String NSLocalNotificationCenterType;
public static Integer NSNotificationSuspensionBehaviorDrop = 1;
public static Integer NSNotificationSuspensionBehaviorCoalesce = 2;
public static Integer NSNotificationSuspensionBehaviorHold = 3;
public static Integer NSNotificationSuspensionBehaviorDeliverImmediately = 4;

	public static class NSNotificationSuspensionBehavior extends NSUInteger { }}
