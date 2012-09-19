package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSError;
import static ns.NSError.*;
import ns.INSError;
import static ns.INSError.*;
import ns.NSFileHandle;
import static ns.NSFileHandle.*;
import ns.INSFileHandle;
import static ns.INSFileHandle.*;

import ns.NSInputStream;

public abstract class INSInputStream_file extends NSInputStream {

	protected NSObject _delegate;
	protected NSError _error;
	protected NSStreamStatus _status;
	protected String _path;
	protected NSFileHandle _fileHandle;

}
