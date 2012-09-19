package ru.andremoniy.jcocoa;


public abstract class INSCancelInputSource_posix extends NSSelectInputSource {

	protected NSSocket _cancelRead;
	protected NSSocket _cancelWrite;
	protected Boolean _hasCanceled;

}
