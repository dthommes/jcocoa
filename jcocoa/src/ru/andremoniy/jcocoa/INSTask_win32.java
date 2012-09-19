package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSHandleMonitor_win32;
import static ns.NSHandleMonitor_win32.*;
import ns.INSHandleMonitor_win32;
import static ns.INSHandleMonitor_win32.*;

import ns.NSTask;

public abstract class INSTask_win32 extends NSTask {

	protected DWORD _exitCode;
	protected NSHandleMonitor_win32 _monitor;
	protected PROCESS_INFORMATION _processInfo;

	public void launch() { return ;
};
	public void terminate() { return ;
};
	public int processIdentifier() { return null;
};
}
