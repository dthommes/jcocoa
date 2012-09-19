package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSHandleMonitor_win32;
import static ns.NSHandleMonitor_win32.*;
import ns.INSHandleMonitor_win32;
import static ns.INSHandleMonitor_win32.*;

import ns.NSObject;

public abstract class INSParentDeathMonitor_win32 extends NSObject {

	protected NSHandleMonitor_win32 _monitor;
	protected HANDLE _parentHandle;

	public NSHandleMonitor_win32 handleMonitor() { return null;
};
}
