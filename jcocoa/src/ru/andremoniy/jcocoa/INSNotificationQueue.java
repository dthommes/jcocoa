package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSNotificationCenter;
import static ns.NSNotificationCenter.*;
import ns.INSNotificationCenter;
import static ns.INSNotificationCenter.*;
import ns.NSNotification;
import static ns.NSNotification.*;
import ns.INSNotification;
import static ns.INSNotification.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSNotificationQueue extends NSObject {
public static Integer NSPostWhenIdle = 1;
public static Integer NSPostASAP = 2;
public static Integer NSPostNow = 3;

	public static class NSPostingStyle extends NSUInteger { }public static Integer NSNotificationNoCoalescing = 0;
public static Integer NSNotificationCoalescingOnName = 1;
public static Integer NSNotificationCoalescingOnSender = 2;

	public static class NSNotificationCoalescing extends NSUInteger { }
	protected NSObject _notificationCenter;
	protected NSObject _asapQueue;
	protected NSObject _asapObs;
	protected NSObject _idleQueue;
	protected NSObject _idleObs;

	public NSObject initWithNotificationCenter(NSNotificationCenter notificationCenter) { return null;
};
	public void enqueueNotification(NSNotification notification, NSPostingStyle postingStyle) { return ;
};
	public void enqueueNotification(NSNotification notification, NSPostingStyle postingStyle, Integer coalesceMask, NSArray modes) { return ;
};
	public void dequeueNotificationsMatching(NSNotification notification, Integer coalesceMask) { return ;
};
}
