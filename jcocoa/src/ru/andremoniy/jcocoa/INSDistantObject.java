package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSConnection;
import static ns.NSConnection.*;
import ns.INSConnection;
import static ns.INSConnection.*;

import ns.NSProxy;

public abstract class INSDistantObject extends NSProxy {

	protected NSObject _knownSelectors;
	protected Integer _wireCount;
	protected Integer _refCount;
	protected NSObject _proto;
	protected uint16_t ___2;
	protected uint8_t ___1;
	protected uint8_t _wireType;
	protected NSObject _remoteClass;

	public NSObject initWithTarget(NSObject target, NSConnection connection) { return null;
};
	public NSObject initWithLocal(NSObject target, NSConnection connection) { return null;
};
	public void setProtocolForProxy(Protocol proto) { return ;
};
	public NSConnection connectionForProxy() { return null;
};
}
