package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSObject;
import static ns.NSObject.*;
import ns.INSObject;
import static ns.INSObject.*;

import ns.NSProxy;

public abstract class INSProtocolChecker extends NSProxy {
	public Protocol protocol() { return null;
};
	public NSObject target() { return null;
};
	public NSObject initWithTarget(NSObject anObject, Protocol aProtocol) { return null;
};
}
