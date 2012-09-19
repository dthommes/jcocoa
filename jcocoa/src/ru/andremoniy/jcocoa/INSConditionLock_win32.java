package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSConditionLock;

public abstract class INSConditionLock_win32 extends NSConditionLock {

	protected Boolean _conditionWasBroadcast;
	protected Integer _numberOfWaiters;
	protected HANDLE _semaphore;
	protected HANDLE _waitersDone;
	protected HANDLE _mutex;
	protected CRITICAL_SECTION _waitersNumber;
	protected Integer _value;

}
