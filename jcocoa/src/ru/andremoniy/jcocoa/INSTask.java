package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSObject;

public abstract class INSTask extends NSObject {

	public static class NSTaskTerminationReason extends NSInteger { }	public NSObject init() { return null;
};
	public void setLaunchPath(String path) { return ;
};
	public void setArguments(NSArray arguments) { return ;
};
	public void setEnvironment(NSDictionary dict) { return ;
};
	public void setCurrentDirectoryPath(String path) { return ;
};
	public void setStandardInput(NSObject input) { return ;
};
	public void setStandardOutput(NSObject output) { return ;
};
	public void setStandardError(NSObject error) { return ;
};
	public String launchPath() { return null;
};
	public NSArray arguments() { return null;
};
	public NSDictionary environment() { return null;
};
	public String currentDirectoryPath() { return null;
};
	public NSObject standardInput() { return null;
};
	public NSObject standardOutput() { return null;
};
	public NSObject standardError() { return null;
};
	public void launch() { return ;
};
	public void interrupt() { return ;
};
	public void terminate() { return ;
};
	public Boolean suspend() { return null;
};
	public Boolean resume() { return null;
};
	public int processIdentifier() { return null;
};
	public Boolean isRunning() { return null;
};
	public int terminationStatus() { return null;
};
	public NSTaskTerminationReason terminationReason() { return null;
};
	public void waitUntilExit() { return ;
};
}
