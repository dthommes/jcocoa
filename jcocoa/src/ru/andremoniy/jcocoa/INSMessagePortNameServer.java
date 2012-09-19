package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSPort;
import static ns.NSPort.*;
import ns.INSPort;
import static ns.INSPort.*;

import ns.NSPortNameServer;

public abstract class INSMessagePortNameServer extends NSPortNameServer {
	public NSPort portForName(String name, String host) { return null;
};
	public NSPort portForName(String name) { return null;
};
}
