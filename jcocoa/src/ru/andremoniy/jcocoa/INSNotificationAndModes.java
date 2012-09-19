package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSNotification;
import static ns.NSNotification.*;
import ns.INSNotification;
import static ns.INSNotification.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSNotificationAndModes extends NSObject {

	protected NSNotification _notification;
	protected NSArray _modes;

	public NSArray modes() { return null;
};
	public NSNotification notification() { return null;
};
}
