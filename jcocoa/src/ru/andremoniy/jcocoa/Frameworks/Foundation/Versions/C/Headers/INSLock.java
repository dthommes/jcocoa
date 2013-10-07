package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCalendarDate.INSDate;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCalendarDate.INSDate.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDate;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDate.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCalendarDate.INSDate;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCalendarDate.INSDate.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDate;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDate.*;

public abstract class INSLock extends NSObject {

	protected Void _priv;

	public Boolean tryLock() { return null;
};
	public Boolean lockBeforeDate(NSDate limit) { return null;
};
	public void setName(String n) { return ;
};
	public String name() { return null;
};
	public abstract class NSLocking {
	public void lock() { return ;
};
	public void unlock() { return ;
};
	
}
public abstract static class INSConditionLock extends NSObject {

	protected Void _priv;

	public NSObject initWithCondition(Integer condition) { return null;
};
	public Integer condition() { return null;
};
	public void lockWhenCondition(Integer condition) { return ;
};
	public Boolean tryLock() { return null;
};
	public Boolean tryLockWhenCondition(Integer condition) { return null;
};
	public void unlockWithCondition(Integer condition) { return ;
};
	public Boolean lockBeforeDate(NSDate limit) { return null;
};
	public Boolean lockWhenCondition(Integer condition, NSDate limit) { return null;
};
	public void setName(String n) { return ;
};
	public String name() { return null;
};

}
public abstract static class INSRecursiveLock extends NSObject {

	protected Void _priv;

	public Boolean tryLock() { return null;
};
	public Boolean lockBeforeDate(NSDate limit) { return null;
};
	public void setName(String n) { return ;
};
	public String name() { return null;
};

}
}
