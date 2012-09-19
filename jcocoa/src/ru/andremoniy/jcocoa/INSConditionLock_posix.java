package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSThread;
import static ns.NSThread.*;
import ns.INSThread;
import static ns.INSThread.*;

import ns.NSConditionLock;

public abstract class INSConditionLock_posix extends NSConditionLock {

	protected pthread_cond_t _cond;
	protected pthread_mutex_t _mutex;
	protected Integer _value;
	protected NSThread _lockingThread;

}
