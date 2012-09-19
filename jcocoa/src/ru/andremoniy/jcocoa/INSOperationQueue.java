package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSThread;
import static ns.NSThread.*;
import ns.INSThread;
import static ns.INSThread.*;
import ns.NSCondition;
import static ns.NSCondition.*;
import ns.INSCondition;
import static ns.INSCondition.*;
import ns.NSOperation;
import static ns.NSOperation.*;
import ns.INSOperation;
import static ns.INSOperation.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSOperationQueue extends NSObject {
public static Integer NSOperationQueueDefaultMaxConcurrentOperationCount = -1;
public static Integer NSOperationQueuePriority_Count = 3;

	protected NSThread _thread;
	protected NSCondition workAvailable;
	protected NSCondition suspendedCondition;
	protected NSCondition allWorkDone;
	protected Boolean isSuspended;
	protected void queues;
	protected String _name;

	public NSObject init() { return null;
};
	public void addOperation(NSOperation op) { return ;
};
	public void addOperations(NSArray ops, Boolean wait) { return ;
};
	public void cancelAllOperations() { return ;
};
	public Integer maxConcurrentOperationCount() { return null;
};
	public void setMaxConcurrentOperationCount(Integer count) { return ;
};
	public String name() { return null;
};
	public void setName(String newName) { return ;
};
	public NSArray operations() { return null;
};
	public Boolean isSuspended() { return null;
};
	public void setSuspended(Boolean suspend) { return ;
};
	public void waitUntilAllOperationsAreFinished() { return ;
};
}
