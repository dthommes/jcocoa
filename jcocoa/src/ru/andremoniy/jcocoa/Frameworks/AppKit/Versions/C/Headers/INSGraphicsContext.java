package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSGraphicsContext {
	public void setShouldAntialias(Boolean antialias) { return ;
};
	public Boolean shouldAntialias() { return null;
};
	public void setImageInterpolation(NSImageInterpolation interpolation) { return ;
};
	public NSImageInterpolation imageInterpolation() { return null;
};
	public static String NSGraphicsContextDestinationAttributeName;
	public static String NSGraphicsContextRepresentationFormatAttributeName;
	public static String NSGraphicsContextPSFormat;
	public static String NSGraphicsContextPDFFormat;
public static Integer NSImageInterpolationDefault = 0;
public static Integer NSImageInterpolationNone = 1;
public static Integer NSImageInterpolationLow = 2;
public static Integer NSImageInterpolationHigh = 3;

	public static class NSImageInterpolation extends NSUInteger { }}
