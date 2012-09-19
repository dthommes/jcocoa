package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSView;
import static ns.NSView.*;
import ns.INSView;
import static ns.INSView.*;
import ns.NSColor;
import static ns.NSColor.*;
import ns.INSColor;
import static ns.INSColor.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;

import ns.NSCell;

public abstract class INSBrowserCell extends NSCell {
	public NSColor highlightColorInView(NSView controlView) { return null;
};
	public Boolean isLeaf() { return null;
};
	public void setLeaf(Boolean flag) { return ;
};
	public Boolean isLoaded() { return null;
};
	public void setLoaded(Boolean flag) { return ;
};
	public void reset() { return ;
};
	public void set() { return ;
};
	public void setImage(NSImage image) { return ;
};
	public NSImage image() { return null;
};
	public void setAlternateImage(NSImage newAltImage) { return ;
};
	public NSImage alternateImage() { return null;
};
}
