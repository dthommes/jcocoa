package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSPort;
import static ns.NSPort.*;
import ns.INSPort;
import static ns.INSPort.*;

import ns.NSPortNameServer;

public abstract class INSSocketPortNameServer extends NSPortNameServer {
	public uint16_t defaultNameServerPortNumber() { return null;
};
	public void setDefaultNameServerPortNumber(uint16_t number) { return ;
};
	public NSPort portForName(String name, String host, uint16_t number) { return null;
};
	public NSPort portForName(String name, String host) { return null;
};
	public NSPort portForName(String name) { return null;
};
	public Boolean registerPort(NSPort port, String name) { return null;
};
	public Boolean registerPort(NSPort port, String name, uint16_t number) { return null;
};
	public Boolean removePortForName(String name) { return null;
};
}
