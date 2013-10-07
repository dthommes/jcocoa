package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSGraphicsContext;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSGraphicsContext.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSGraphicsContext;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSGraphicsContext.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;

public abstract class INSImageRep extends NSObject {

	protected String _colorSpaceName;
	protected NSSize _size;
	protected Integer _pixelsWide;
	protected Integer _pixelsHigh;

	public Boolean draw() { return null;
};
	public Boolean drawAtPoint(NSPoint point) { return null;
};
	public Boolean drawInRect(NSRect rect) { return null;
};
	public Boolean drawInRect(NSRect dstSpacePortionRect, NSRect srcSpacePortionRect, NSCompositingOperation op, Double requestedAlpha, Boolean respectContextIsFlipped, NSDictionary hints) { return null;
};
	public void setSize(NSSize aSize) { return ;
};
	public NSSize size() { return null;
};
	public void setAlpha(Boolean flag) { return ;
};
	public Boolean hasAlpha() { return null;
};
	public void setOpaque(Boolean flag) { return ;
};
	public Boolean isOpaque() { return null;
};
	public void setColorSpaceName(String string) { return ;
};
	public String colorSpaceName() { return null;
};
	public void setBitsPerSample(Integer anInt) { return ;
};
	public Integer bitsPerSample() { return null;
};
	public void setPixelsWide(Integer anInt) { return ;
};
	public Integer pixelsWide() { return null;
};
	public void setPixelsHigh(Integer anInt) { return ;
};
	public Integer pixelsHigh() { return null;
};
	public CGImageRef CGImageForProposedRect(NSRect proposedDestRect, NSGraphicsContext context, NSDictionary hints) { return null;
};
public static Integer NSImageRepMatchesDevice = 0;
	public static String NSImageRepRegistryDidChangeNotification;
}
