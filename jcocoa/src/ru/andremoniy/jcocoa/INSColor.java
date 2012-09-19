package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSColor;
import static ns.NSColor.*;
import ns.INSColor;
import static ns.INSColor.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSPasteboard;
import static ns.NSPasteboard.*;
import ns.INSPasteboard;
import static ns.INSPasteboard.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;

import ns.NSObject;

public abstract class INSColor extends NSObject {
	public NSColor highlightWithLevel(Double val) { return null;
};
	public NSColor shadowWithLevel(Double val) { return null;
};
	public void set() { return ;
};
	public String colorSpaceName() { return null;
};
	public NSColor colorUsingColorSpaceName(String colorSpace) { return null;
};
	public NSColor colorUsingColorSpaceName(String colorSpace, NSDictionary deviceDescription) { return null;
};
	public NSColor blendedColorWithFraction(Double fraction, NSColor color) { return null;
};
	public NSColor colorWithAlphaComponent(Double alpha) { return null;
};
	public String catalogNameComponent() { return null;
};
	public String colorNameComponent() { return null;
};
	public String localizedCatalogNameComponent() { return null;
};
	public String localizedColorNameComponent() { return null;
};
	public Double redComponent() { return null;
};
	public Double greenComponent() { return null;
};
	public Double blueComponent() { return null;
};
	public void getRed(Double red, Double green, Double blue, Double alpha) { return ;
};
	public Double hueComponent() { return null;
};
	public Double saturationComponent() { return null;
};
	public Double brightnessComponent() { return null;
};
	public void getHue(Double hue, Double saturation, Double brightness, Double alpha) { return ;
};
	public Double whiteComponent() { return null;
};
	public void getWhite(Double white, Double alpha) { return ;
};
	public Double cyanComponent() { return null;
};
	public Double magentaComponent() { return null;
};
	public Double yellowComponent() { return null;
};
	public Double blackComponent() { return null;
};
	public void getCyan(Double cyan, Double magenta, Double yellow, Double black, Double alpha) { return ;
};
	public Double alphaComponent() { return null;
};
	public void writeToPasteboard(NSPasteboard pasteBoard) { return ;
};
	public NSImage patternImage() { return null;
};
	public void drawSwatchInRect(NSRect rect) { return ;
};
	public NSColor decodeNXColor() { return null;
};
}
