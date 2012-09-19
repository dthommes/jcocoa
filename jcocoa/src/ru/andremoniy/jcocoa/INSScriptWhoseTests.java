package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSScriptWhoseTest extends NSObject {
public static Integer NSEqualToComparison = 0;
public static Integer NSLessThanOrEqualToComparison = null;
public static Integer NSLessThanComparison = null;
public static Integer NSGreaterThanOrEqualToComparison = null;
public static Integer NSGreaterThanComparison = null;
public static Integer NSBeginsWithComparison = null;
public static Integer NSEndsWithComparison = null;
public static Integer NSContainsComparison = null;

	public static class NSTestComparisonOperation extends NSUInteger { }	public Boolean isTrue() { return null;
};

	protected int _operator;
	protected NSObject _subTests;

	public NSObject initAndTestWithTests(NSArray subTests) { return null;
};
	public NSObject initOrTestWithTests(NSArray subTests) { return null;
};
	public NSObject initNotTestWithTest(NSScriptWhoseTest subTest) { return null;
};

	protected NSTestComparisonOperation _comparisonOperator;
	protected NSScriptObjectSpecifier _object1;
	protected NSObject _object2;

	public NSObject initWithObjectSpecifier(NSScriptObjectSpecifier obj1, NSTestComparisonOperation compOp, NSObject obj2) { return null;
};
	public Boolean isEqualTo(NSObject object) { return null;
};
	public Boolean isLessThanOrEqualTo(NSObject object) { return null;
};
	public Boolean isLessThan(NSObject object) { return null;
};
	public Boolean isGreaterThanOrEqualTo(NSObject object) { return null;
};
	public Boolean isGreaterThan(NSObject object) { return null;
};
	public Boolean isNotEqualTo(NSObject object) { return null;
};
	public Boolean doesContain(NSObject object) { return null;
};
	public Boolean isLike(String object) { return null;
};
	public Boolean isCaseInsensitiveLike(String object) { return null;
};
	public Boolean scriptingIsEqualTo(NSObject object) { return null;
};
	public Boolean scriptingIsLessThanOrEqualTo(NSObject object) { return null;
};
	public Boolean scriptingIsLessThan(NSObject object) { return null;
};
	public Boolean scriptingIsGreaterThanOrEqualTo(NSObject object) { return null;
};
	public Boolean scriptingIsGreaterThan(NSObject object) { return null;
};
	public Boolean scriptingBeginsWith(NSObject object) { return null;
};
	public Boolean scriptingEndsWith(NSObject object) { return null;
};
	public Boolean scriptingContains(NSObject object) { return null;
};
}
