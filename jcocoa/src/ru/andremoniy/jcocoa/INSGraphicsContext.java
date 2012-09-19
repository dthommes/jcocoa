package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSObject;

public abstract class INSGraphicsContext extends NSObject {
public static Integer NSImageInterpolationDefault = 0;
public static Integer NSImageInterpolationNone = 1;
public static Integer NSImageInterpolationLow = 2;
public static Integer NSImageInterpolationHigh = 3;

	public static class NSImageInterpolation extends NSUInteger { }	public NSDictionary attributes() { return null;
};
	public Boolean isDrawingToScreen() { return null;
};
	public void saveGraphicsState() { return ;
};
	public void restoreGraphicsState() { return ;
};
	public void flushGraphics() { return ;
};
	public void graphicsPort() { return ;
};
	public void setShouldAntialias(Boolean antialias) { return ;
};
	public Boolean shouldAntialias() { return null;
};
	public void setImageInterpolation(NSImageInterpolation interpolation) { return ;
};
	public NSImageInterpolation imageInterpolation() { return null;
};
}
