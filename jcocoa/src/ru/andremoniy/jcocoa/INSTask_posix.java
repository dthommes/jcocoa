package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSTask;

public abstract class INSTask_posix extends NSTask {
	public static int childSignalHandler;

	protected int _processID;
	protected int _terminationStatus;

	public void launch() { return ;
};
	public void terminate() { return ;
};
	public void setTerminationStatus(int terminationStatus) { return ;
};
	public void taskFinished() { return ;
};
}
