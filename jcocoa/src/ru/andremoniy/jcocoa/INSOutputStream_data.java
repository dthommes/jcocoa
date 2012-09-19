package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSError;
import static ns.NSError.*;
import ns.INSError;
import static ns.INSError.*;
import ns.NSMutableData;
import static ns.NSMutableData.*;
import ns.INSMutableData;
import static ns.INSMutableData.*;

import ns.NSOutputStream;

public abstract class INSOutputStream_data extends NSOutputStream {

	protected NSObject _delegate;
	protected NSError _error;
	protected NSStreamStatus _status;
	protected NSMutableData _data;

}
