package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSTask {
	public void waitUntilExit() { return ;
};

	public static class NSTaskTerminationReason extends NSInteger { }	public static String NSTaskDidTerminateNotification;
}
