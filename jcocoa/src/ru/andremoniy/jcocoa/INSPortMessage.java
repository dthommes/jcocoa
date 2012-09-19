package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSPort;
import static ns.NSPort.*;
import ns.INSPort;
import static ns.INSPort.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;

import ns.NSObject;

public abstract class INSPortMessage extends NSObject {

	protected NSPort localPort;
	protected NSPort remotePort;
	protected NSMutableArray components;
	protected uint32_t msgid;
	protected void reserved2;
	protected void reserved;

	public NSObject initWithSendPort(NSPort sendPort, NSPort replyPort, NSArray components) { return null;
};
	public NSArray components() { return null;
};
	public NSPort receivePort() { return null;
};
	public NSPort sendPort() { return null;
};
	public Boolean sendBeforeDate(NSDate date) { return null;
};
	public uint32_t msgid() { return null;
};
	public void setMsgid(uint32_t msgid) { return ;
};
}
