package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSInputSourceSet;
import static ns.NSInputSourceSet.*;
import ns.INSInputSourceSet;
import static ns.INSInputSourceSet.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSTimer;
import static ns.NSTimer.*;
import ns.INSTimer;
import static ns.INSTimer.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;
import ns.NSInputSource;
import static ns.NSInputSource.*;
import ns.INSInputSource;
import static ns.INSInputSource.*;
import ns.NSDelayedPerform;
import static ns.NSDelayedPerform.*;
import ns.INSDelayedPerform;
import static ns.INSDelayedPerform.*;

import ns.NSObject;

public abstract class INSRunLoopState extends NSObject {

	protected NSInputSourceSet _inputSourceSet;
	protected NSArray _asyncInputSourceSets;
	protected NSMutableArray _timers;
	protected NSObject _cancelSource;

	public void addTimer(NSTimer timer) { return ;
};
	public void startingInMode(String mode) { return ;
};
	public Boolean fireFirstTimer() { return null;
};
	public NSDate limitDateForMode(String mode) { return null;
};
	public void addInputSource(NSInputSource source) { return ;
};
	public void removeInputSource(NSInputSource source) { return ;
};
	public void invalidateTimerWithDelayedPerform(NSDelayedPerform delayed) { return ;
};
	public Boolean waitForSingleInputForMode(String mode, NSDate date) { return null;
};
	public Boolean pollInputForMode(String mode) { return null;
};
	public void wakeUp() { return ;
};
}
