package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSNotification.INSNotificationCenter;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSNotification.INSNotificationCenter.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSNotification.INSNotificationCenter;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSNotification.INSNotificationCenter.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;

public abstract class INSNotificationQueue extends NSObject {

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
public static Integer NSPostWhenIdle = 1;
public static Integer NSPostASAP = 2;
public static Integer NSPostNow = 3;

	public static class NSPostingStyle extends NSUInteger { }public static Integer NSNotificationNoCoalescing = 0;
public static Integer NSNotificationCoalescingOnName = 1;
public static Integer NSNotificationCoalescingOnSender = 2;

	public static class NSNotificationCoalescing extends NSUInteger { }}
