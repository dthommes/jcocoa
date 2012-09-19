package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSFileHandle;
import static ns.NSFileHandle.*;
import ns.INSFileHandle;
import static ns.INSFileHandle.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSHandleMonitor_win32;
import static ns.NSHandleMonitor_win32.*;
import ns.INSHandleMonitor_win32;
import static ns.INSHandleMonitor_win32.*;

import ns.NSObject;

public abstract class INSReadInBackground_win32 extends NSObject {

	protected NSFileHandle _fileHandle;
	protected HANDLE _readHandle;
	protected Integer _bufferCapacity;
	protected Integer _bufferSize;
	protected void _buffer;
	protected NSArray _modes;
	protected HANDLE _threadHandle;
	protected NSHandleMonitor_win32 _threadMonitor;

	public void detach() { return ;
};
}
