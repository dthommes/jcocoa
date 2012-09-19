package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSException extends NSObject {

	protected String name;
	protected String reason;
	protected NSDictionary userInfo;
	protected NSObject reserved;

	public NSObject initWithName(String aName, String aReason, NSDictionary aUserInfo) { return null;
};
	public String name() { return null;
};
	public String reason() { return null;
};
	public NSDictionary userInfo() { return null;
};
	public NSArray callStackReturnAddresses() { return null;
};
	public NSArray callStackSymbols() { return null;
};
	public void raise() { return ;
};
	public static String NSAssertionHandlerKey;

	protected void _reserved;

	public void handleFailureInMethod(SEL selector, NSObject object, String fileName, Integer line, String format) { return ;
};
	public void handleFailureInFunction(String functionName, String fileName, Integer line, String format) { return ;
};
}
