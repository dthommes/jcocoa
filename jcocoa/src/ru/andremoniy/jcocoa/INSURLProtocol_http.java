package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSInputStream;
import static ns.NSInputStream.*;
import ns.INSInputStream;
import static ns.INSInputStream.*;
import ns.NSOutputStream;
import static ns.NSOutputStream.*;
import ns.INSOutputStream;
import static ns.INSOutputStream.*;
import ns.NSTimer;
import static ns.NSTimer.*;
import ns.INSTimer;
import static ns.INSTimer.*;
import ns.NSMutableData;
import static ns.NSMutableData.*;
import ns.INSMutableData;
import static ns.INSMutableData.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;
import ns.NSMutableDictionary;
import static ns.NSMutableDictionary.*;
import ns.INSMutableDictionary;
import static ns.INSMutableDictionary.*;

import ns.NSURLProtocol;

public abstract class INSURLProtocol_http extends NSURLProtocol {

	protected NSMutableArray _modes;
	protected NSInputStream _inputStream;
	protected NSOutputStream _outputStream;
	protected NSTimer _timeout;
	protected NSMutableArray _outputQueue;
	protected Integer _outputNextOffset;
	protected NSMutableData _data;
	protected uint8_t _bytes;
	protected Integer _length;
	protected int _state;
	protected NSRange _range;
	protected Integer _statusCode;
	protected String _currentKey;
	protected NSMutableDictionary _rawHeaders;
	protected NSMutableDictionary _headers;
	protected Integer _expectedContentLength;
	protected Integer _totalContentReceived;
	protected Integer _chunkSize;

}
