package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSSelectInputSource;
import static ns.NSSelectInputSource.*;
import ns.INSSelectInputSource;
import static ns.INSSelectInputSource.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSFileHandle;

public abstract class INSFileHandle_posix extends NSFileHandle {

	protected int _fileDescriptor;
	protected Boolean _closeOnDealloc;
	protected NSSelectInputSource _inputSource;
	protected NSArray _backgroundModes;

	public NSObject initWithFileDescriptor(int fileDescriptor, Boolean closeOnDealloc) { return null;
};
	public int fileDescriptor() { return null;
};
	public void cancelBackgroundMonitoring() { return ;
};
}
