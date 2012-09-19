package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSInterfaceStyle;
import static ns.NSInterfaceStyle.*;
import ns.INSInterfaceStyle;
import static ns.INSInterfaceStyle.*;

public abstract class INSResponder {
public static Integer NSNoInterfaceStyle = 0;
public static Integer NSNextStepInterfaceStyle = 1;
public static Integer NSWindows95InterfaceStyle = 2;
public static Integer NSMacintoshInterfaceStyle = 3;

	public static class NSInterfaceStyle extends NSUInteger { }	public NSInterfaceStyle interfaceStyle() { return null;
};
	public void setInterfaceStyle(NSInterfaceStyle interfaceStyle) { return ;
};
}
