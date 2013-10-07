package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSInterfaceStyle.INSResponder;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSInterfaceStyle.INSResponder.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSResponder;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSResponder.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSInterfaceStyle.INSResponder;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSInterfaceStyle.INSResponder.*;

public abstract class INSInterfaceStyle {
public static Integer NSNoInterfaceStyle = 0;
public static Integer NSNextStepInterfaceStyle = 1;
public static Integer NSWindows95InterfaceStyle = 2;
public static Integer NSMacintoshInterfaceStyle = 3;

	public static class NSInterfaceStyle extends NSUInteger { }	public static NSResponder NSInterfaceStyleForKey;
	public static String NSInterfaceStyleDefault;
public abstract static class INSResponder {
	public NSInterfaceStyle interfaceStyle() { return null;
};
	public void setInterfaceStyle(NSInterfaceStyle interfaceStyle) { return ;
};

}
}
