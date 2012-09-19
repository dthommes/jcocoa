package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSNotificationCenter;

public abstract class INSDistributedNotificationCenter extends NSNotificationCenter {
public static Integer NSNotificationSuspensionBehaviorDrop = 1;
public static Integer NSNotificationSuspensionBehaviorCoalesce = 2;
public static Integer NSNotificationSuspensionBehaviorHold = 3;
public static Integer NSNotificationSuspensionBehaviorDeliverImmediately = 4;

	public static class NSNotificationSuspensionBehavior extends NSUInteger { }	public void addObserver(NSObject observer, SEL selector, String name, String object, NSNotificationSuspensionBehavior suspensionBehavior) { return ;
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
}
