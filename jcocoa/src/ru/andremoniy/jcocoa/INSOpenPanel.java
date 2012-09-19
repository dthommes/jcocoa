package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSWindow;
import static ns.NSWindow.*;
import ns.INSWindow;
import static ns.INSWindow.*;

import ns.NSSavePanel;

public abstract class INSOpenPanel extends NSSavePanel {

	protected char _reservedOpenPanel;
	protected void _privateOpenPanel;

	public NSArray URLs() { return null;
};
	public Boolean resolvesAliases() { return null;
};
	public void setResolvesAliases(Boolean flag) { return ;
};
	public Boolean canChooseDirectories() { return null;
};
	public void setCanChooseDirectories(Boolean flag) { return ;
};
	public Boolean allowsMultipleSelection() { return null;
};
	public void setAllowsMultipleSelection(Boolean flag) { return ;
};
	public Boolean canChooseFiles() { return null;
};
	public void setCanChooseFiles(Boolean flag) { return ;
};
	public NSArray filenames() { return null;
};
	public void beginSheetForDirectory(String path, String name, NSArray fileTypes, NSWindow docWindow, NSObject delegate, SEL didEndSelector, void contextInfo) { return ;
};
	public void beginForDirectory(String path, String name, NSArray fileTypes, NSObject delegate, SEL didEndSelector, void contextInfo) { return ;
};
	public Integer runModalForDirectory(String path, String name, NSArray fileTypes) { return null;
};
	public Integer runModalForTypes(NSArray fileTypes) { return null;
};
}
