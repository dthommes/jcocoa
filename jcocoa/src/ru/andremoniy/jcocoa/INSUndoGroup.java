package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSUndoGroup;
import static ns.NSUndoGroup.*;
import ns.INSUndoGroup;
import static ns.INSUndoGroup.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSInvocation;
import static ns.NSInvocation.*;
import ns.INSInvocation;
import static ns.INSInvocation.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSUndoGroup extends NSObject {

	protected NSUndoGroup _parentGroup;
	protected NSMutableArray _invocations;

	public NSObject initWithParentGroup(NSUndoGroup parentGroup) { return null;
};
	public NSUndoGroup parentGroup() { return null;
};
	public void addInvocation(NSInvocation invocation) { return ;
};
	public void addInvocationsFromArray(NSArray array) { return ;
};
	public NSArray invocations() { return null;
};
	public void removeInvocationsWithTarget(NSObject target) { return ;
};
	public void invokeInvocations() { return ;
};
}
