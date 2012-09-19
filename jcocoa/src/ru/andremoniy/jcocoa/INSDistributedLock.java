package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;

import ns.NSObject;

public abstract class INSDistributedLock extends NSObject {

	protected void _priv;

	public NSObject initWithPath(String path) { return null;
};
	public Boolean tryLock() { return null;
};
	public void unlock() { return ;
};
	public void breakLock() { return ;
};
	public NSDate lockDate() { return null;
};
}
