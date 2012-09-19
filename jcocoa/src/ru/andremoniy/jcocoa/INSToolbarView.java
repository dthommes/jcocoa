package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSToolbar;
import static ns.NSToolbar.*;
import ns.INSToolbar;
import static ns.INSToolbar.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSToolbarItem;
import static ns.NSToolbarItem.*;
import ns.INSToolbarItem;
import static ns.INSToolbarItem.*;

import ns.NSView;

public abstract class INSToolbarView extends NSView {

	protected NSToolbar _toolbar;
	protected double _minXMargin;
	protected double _minYMargin;
	protected NSMutableArray _visibleItems;
	protected Boolean _overflow;

	public NSToolbar toolbar() { return null;
};
	public void setToolbar(NSToolbar toolbar) { return ;
};
	public NSArray visibleItems() { return null;
};
	public void _insertItem(NSToolbarItem item, Integer index) { return ;
};
	public void _removeItemAtIndex(Integer index) { return ;
};
	public void layoutViewsWithWidth(Double width, Boolean setFrame) { return ;
};
	public void layoutViews() { return ;
};
}
