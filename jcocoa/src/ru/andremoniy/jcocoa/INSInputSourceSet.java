package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSMutableSet;
import static ns.NSMutableSet.*;
import ns.INSMutableSet;
import static ns.INSMutableSet.*;
import ns.NSInputSource;
import static ns.NSInputSource.*;
import ns.INSInputSource;
import static ns.INSInputSource.*;
import ns.NSSet;
import static ns.NSSet.*;
import ns.INSSet;
import static ns.INSSet.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;

import ns.NSObject;

public abstract class INSInputSourceSet extends NSObject {

	protected NSMutableSet _inputSources;

	public Integer count() { return null;
};
	public Boolean recognizesInputSource(NSInputSource source) { return null;
};
	public void addInputSource(NSInputSource source) { return ;
};
	public void removeInputSource(NSInputSource source) { return ;
};
	public NSSet validInputSources() { return null;
};
	public Boolean fireSingleImmediateInputInMode(String mode) { return null;
};
	public void startingInMode(String mode) { return ;
};
	public void waitInBackgroundInMode(String mode) { return ;
};
	public Boolean waitForInputInMode(String mode, NSDate date) { return null;
};
}
