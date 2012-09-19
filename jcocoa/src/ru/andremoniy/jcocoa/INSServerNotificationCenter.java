package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSNotification;
import static ns.NSNotification.*;
import ns.INSNotification;
import static ns.INSNotification.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSNotificationCenter;

public abstract class INSServerNotificationCenter extends NSNotificationCenter {

	protected void _internal;

	public String serviceHost() { return null;
};
	public void addObserver(NSObject observer, SEL aSelector, String aName, NSObject anObject) { return ;
};
	public void postNotification(NSNotification notification) { return ;
};
	public void postNotificationName(String aName, NSObject anObject) { return ;
};
	public void postNotificationName(String aName, NSObject anObject, NSDictionary aUserInfo) { return ;
};
	public void removeObserver(NSObject observer) { return ;
};
	public void removeObserver(NSObject observer, String aName, NSObject anObject) { return ;
};
}
