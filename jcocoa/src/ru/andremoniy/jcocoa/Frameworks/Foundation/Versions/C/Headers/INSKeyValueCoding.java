package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSKeyValueCoding {
	public static String NSUndefinedKeyException;
	public static String NSAverageKeyValueOperator;
	public static String NSCountKeyValueOperator;
	public static String NSDistinctUnionOfArraysKeyValueOperator;
	public static String NSDistinctUnionOfObjectsKeyValueOperator;
	public static String NSDistinctUnionOfSetsKeyValueOperator;
	public static String NSMaximumKeyValueOperator;
	public static String NSMinimumKeyValueOperator;
	public static String NSSumKeyValueOperator;
	public static String NSUnionOfArraysKeyValueOperator;
	public static String NSUnionOfObjectsKeyValueOperator;
	public static String NSUnionOfSetsKeyValueOperator;
public abstract static class INSObject {
	public NSObject valueForKey(String key) { return null;
};
	public void setValue(NSObject value, String key) { return ;
};
	public Boolean validateValue(NSObject ioValue, String inKey, NSError outError) { return null;
};
	public NSMutableArray mutableArrayValueForKey(String key) { return null;
};
	public NSMutableSet mutableSetValueForKey(String key) { return null;
};
	public NSObject valueForKeyPath(String keyPath) { return null;
};
	public void setValue(NSObject value, String keyPath) { return ;
};
	public Boolean validateValue(NSObject ioValue, String inKeyPath, NSError outError) { return null;
};
	public NSMutableArray mutableArrayValueForKeyPath(String keyPath) { return null;
};
	public NSMutableSet mutableSetValueForKeyPath(String keyPath) { return null;
};
	public NSObject valueForUndefinedKey(String key) { return null;
};
	public void setValue(NSObject value, String key) { return ;
};
	public void setNilValueForKey(String key) { return ;
};
	public NSDictionary dictionaryWithValuesForKeys(NSArray keys) { return null;
};
	public void setValuesForKeysWithDictionary(NSDictionary keyedValues) { return ;
};

}
public abstract static class INSArray {
	public NSObject valueForKey(String key) { return null;
};
	public void setValue(NSObject value, String key) { return ;
};

}
public abstract static class INSDictionary {
	public NSObject valueForKey(String key) { return null;
};

}
public abstract static class INSMutableDictionary {
	public void setValue(NSObject value, String key) { return ;
};

}
public abstract static class INSSet {
	public NSObject valueForKey(String key) { return null;
};
	public void setValue(NSObject value, String key) { return ;
};

}
}
