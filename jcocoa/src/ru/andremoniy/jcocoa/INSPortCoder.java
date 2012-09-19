package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSConnection;
import static ns.NSConnection.*;
import ns.INSConnection;
import static ns.INSConnection.*;
import ns.NSPort;
import static ns.NSPort.*;
import ns.INSPort;
import static ns.INSPort.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSPortCoder;
import static ns.NSPortCoder.*;
import ns.INSPortCoder;
import static ns.INSPortCoder.*;

import ns.NSCoder;

public abstract class INSPortCoder extends NSCoder {
	public Boolean isBycopy() { return null;
};
	public Boolean isByref() { return null;
};
	public NSConnection connection() { return null;
};
	public void encodePortObject(NSPort aport) { return ;
};
	public NSPort decodePortObject() { return null;
};
	public NSObject initWithReceivePort(NSPort rcvPort, NSPort sndPort, NSArray comps) { return null;
};
	public void dispatch() { return ;
};
	public Class classForPortCoder() { return null;
};
	public NSObject replacementObjectForPortCoder(NSPortCoder coder) { return null;
};
}
