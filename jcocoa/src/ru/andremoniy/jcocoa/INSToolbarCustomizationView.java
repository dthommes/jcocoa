package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSToolbar;
import static ns.NSToolbar.*;
import ns.INSToolbar;
import static ns.INSToolbar.*;

import ns.NSView;

public abstract class INSToolbarCustomizationView extends NSView {

	protected NSToolbar _toolbar;
	protected Boolean _isDefaultSetView;

	public NSToolbar toolbar() { return null;
};
	public void setToolbar(NSToolbar toolbar) { return ;
};
	public void setDefaultSetView(Boolean flag) { return ;
};
	public Boolean isDefaultSetView() { return null;
};
	public NSSize desiredSize() { return null;
};
}
