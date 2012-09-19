package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSLock;

public abstract class INSLock_posix extends NSLock {

	protected pthread_mutex_t _mutex;

}
