package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSPrinter {
	public NSRect imageRectForPaper(String paperName) { return null;
};
	public Boolean acceptsBinary() { return null;
};
	public Boolean isColor() { return null;
};
	public Boolean isFontAvailable(String faceName) { return null;
};
	public Boolean isOutputStackInReverseOrder() { return null;
};
	public String domain() { return null;
};
	public String host() { return null;
};
	public String note() { return null;
};
public static Integer NSPrinterTableOK = 0;
public static Integer NSPrinterTableNotFound = 1;
public static Integer NSPrinterTableError = 2;

	public static class NSPrinterTableStatus extends NSUInteger { }}
