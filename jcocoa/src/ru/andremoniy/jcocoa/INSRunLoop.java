package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSTimer;
import static ns.NSTimer.*;
import ns.INSTimer;
import static ns.INSTimer.*;
import ns.NSPort;
import static ns.NSPort.*;
import ns.INSPort;
import static ns.INSPort.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSRunLoop extends NSObject {

	protected NSObject _rl;
	protected NSObject _dperf;
	protected NSObject _perft;
	protected NSObject _info;
	protected NSObject _ports;
	protected void _reserved;

	public String currentMode() { return null;
};
	public CFRunLoopRef getCFRunLoop() { return null;
};
	public void addTimer(NSTimer timer, String mode) { return ;
};
	public void addPort(NSPort aPort, String mode) { return ;
};
	public void removePort(NSPort aPort, String mode) { return ;
};
	public NSDate limitDateForMode(String mode) { return null;
};
	public void acceptInputForMode(String mode, NSDate limitDate) { return ;
};
	public void run() { return ;
};
	public void runUntilDate(NSDate limitDate) { return ;
};
	public Boolean runMode(String mode, NSDate limitDate) { return null;
};
	public void performSelector(SEL aSelector, NSObject anArgument, NSTimeInterval delay, NSArray modes) { return ;
};
	public void performSelector(SEL aSelector, NSObject anArgument, NSTimeInterval delay) { return ;
};
	public void performSelector(SEL aSelector, NSObject target, NSObject arg, Integer order, NSArray modes) { return ;
};
	public void cancelPerformSelector(SEL aSelector, NSObject target, NSObject arg) { return ;
};
}
