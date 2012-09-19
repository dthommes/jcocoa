package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSError;
import static ns.NSError.*;
import ns.INSError;
import static ns.INSError.*;

import ns.NSOutputStream;

public abstract class INSOutputStream_buffer extends NSOutputStream {

	protected NSObject _delegate;
	protected NSError _error;
	protected NSStreamStatus _status;
	protected uint8_t _buffer;
	protected Integer _capacity;
	protected Integer _position;

}
