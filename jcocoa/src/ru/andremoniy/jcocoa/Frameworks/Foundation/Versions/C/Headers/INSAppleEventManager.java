package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSAppleEventManager extends NSObject {

	protected Boolean _isPreparedForDispatch;
	protected char _padding;

	public void setEventHandler(NSObject handler, SEL handleEventSelector, AEEventClass eventClass, AEEventID eventID) { return ;
};
	public void removeEventHandlerForEventClass(AEEventClass eventClass, AEEventID eventID) { return ;
};
	public OSErr dispatchRawAppleEvent(AppleEvent theAppleEvent, AppleEvent theReply, SRefCon handlerRefCon) { return null;
};
	public static double NSAppleEventTimeOutDefault;
	public static double NSAppleEventTimeOutNone;
	public static String NSAppleEventManagerWillProcessFirstEventNotification;
}
