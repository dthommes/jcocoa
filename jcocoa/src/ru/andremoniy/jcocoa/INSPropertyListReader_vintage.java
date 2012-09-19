package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;

import ns.NSObject;

public abstract class INSPropertyListReader_vintage extends NSObject {

	protected NSData _data;
	protected Integer _length;
	protected uint8_t _bytes;
	protected Integer _stackCapacity;
	protected Integer _stackSize;
	protected NSObject _stack;
	protected Integer _bufferCapacity;
	protected Integer _bufferSize;
	protected unichar _buffer;
	protected Integer _dataBufferCapacity;
	protected Integer _dataBufferSize;
	protected uint8_t _dataBuffer;
	protected Integer _index;
	protected Integer _lineNumber;
	protected Class _stringClass;
	protected Class _dictionaryClass;
	protected Class _arrayClass;

}
