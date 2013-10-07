package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorSpace;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorSpace.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorSpace;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColorSpace.*;

public abstract class INSScreen extends NSObject {

	protected NSRect _frame;
	protected NSWindowDepth _depth;
	protected Integer _screenNumber;
	protected NSObject _auxiliaryStorage;

	public NSWindowDepth depth() { return null;
};
	public NSRect frame() { return null;
};
	public NSRect visibleFrame() { return null;
};
	public NSDictionary deviceDescription() { return null;
};
	public NSColorSpace colorSpace() { return null;
};
	public NSWindowDepth supportedWindowDepths() { return null;
};

	public static class NSScreenAuxiliaryOpaque {
	}
	public static String NSScreenColorSpaceDidChangeNotification;
}
