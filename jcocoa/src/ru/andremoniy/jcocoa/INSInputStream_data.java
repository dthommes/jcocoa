package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSError;
import static ns.NSError.*;
import ns.INSError;
import static ns.INSError.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;

import ns.NSInputStream;

public abstract class INSInputStream_data extends NSInputStream {

	protected NSObject _delegate;
	protected NSError _error;
	protected NSStreamStatus _status;
	protected NSData _data;
	protected long _position;

}
