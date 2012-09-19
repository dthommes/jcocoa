package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;

import ns.NSObject;

public abstract class INSButtonImageSource extends NSObject {

	protected String _imageName;

	public NSImage normalImage() { return null;
};
	public NSImage alternateImage() { return null;
};
}
