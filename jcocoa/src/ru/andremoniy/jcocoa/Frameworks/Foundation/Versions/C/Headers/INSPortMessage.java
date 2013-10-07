package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSPortMessage extends NSObject {

	protected NSPort localPort;
	protected NSPort remotePort;
	protected NSMutableArray components;
	protected uint32_t msgid;
	protected Void reserved2;
	protected Void reserved;

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
