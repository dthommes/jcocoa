package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;

import ns.NSObject;

public abstract class INSTimer extends NSObject {
	public void fire() { return ;
};
	public NSDate fireDate() { return null;
};
	public NSTimeInterval timeInterval() { return null;
};
	public void invalidate() { return ;
};
	public Boolean isValid() { return null;
};
	public NSObject userInfo() { return null;
};
}
