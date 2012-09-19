package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSLock;

public abstract class INSLock_posix extends NSLock {

	protected pthread_mutex_t _mutex;

}
