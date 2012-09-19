package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSCondition;

public abstract class INSCondition_posix extends NSCondition {

	protected pthread_mutex_t mutex;
	protected pthread_cond_t condition;

}
