package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSSocket;
import static ns.NSSocket.*;
import ns.INSSocket;
import static ns.INSSocket.*;

import ns.NSSelectInputSource;

public abstract class INSCancelInputSource_posix extends NSSelectInputSource {

	protected NSSocket _cancelRead;
	protected NSSocket _cancelWrite;
	protected Boolean _hasCanceled;

}
