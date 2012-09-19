package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

public abstract class INSObject {
	public void _KVO_swizzle() { return ;
};
	public Class _KVO_swizzledClass() { return null;
};
	public void _willChangeValueForKey(String key, NSDictionary changeOptions) { return ;
};
	public void _didChangeValueForKey(String key, NSDictionary ignored) { return ;
};
	public Boolean _hasObserverForKey(String key) { return null;
};
}
