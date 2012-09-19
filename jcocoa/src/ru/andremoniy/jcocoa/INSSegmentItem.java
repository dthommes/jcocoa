package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;
import ns.NSMenu;
import static ns.NSMenu.*;
import ns.INSMenu;
import static ns.INSMenu.*;

import ns.NSObject;

public abstract class INSSegmentItem extends NSObject {

	protected int _tag;
	protected NSImage _image;
	protected Boolean _isEnabled;
	protected Boolean _isSelected;
	protected String _label;
	protected NSMenu _menu;
	protected String _toolTip;
	protected Double _width;
	protected NSImageScaling _imageScaling;

	public int tag() { return null;
};
	public NSImage image() { return null;
};
	public Boolean isEnabled() { return null;
};
	public Boolean isSelected() { return null;
};
	public String label() { return null;
};
	public NSMenu menu() { return null;
};
	public String toolTip() { return null;
};
	public Double width() { return null;
};
	public NSImageScaling imageScaling() { return null;
};
	public void setTag(int tag) { return ;
};
	public void setImage(NSImage image) { return ;
};
	public void setEnabled(Boolean flag) { return ;
};
	public void setSelected(Boolean flag) { return ;
};
	public void setLabel(String label) { return ;
};
	public void setMenu(NSMenu menu) { return ;
};
	public void setToolTip(String toolTip) { return ;
};
	public void setWidth(Double width) { return ;
};
	public void setImageScaling(NSImageScaling value) { return ;
};
}
