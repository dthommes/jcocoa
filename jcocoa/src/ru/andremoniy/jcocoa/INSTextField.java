package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSColor;
import static ns.NSColor.*;
import ns.INSColor;
import static ns.INSColor.*;
import ns.NSText;
import static ns.NSText.*;
import ns.INSText;
import static ns.INSText.*;
import ns.NSNotification;
import static ns.NSNotification.*;
import ns.INSNotification;
import static ns.INSNotification.*;

import ns.NSControl;

public abstract class INSTextField extends NSControl {

	protected NSObject _delegate;
	protected SEL _errorAction;

	public void setBackgroundColor(NSColor color) { return ;
};
	public NSColor backgroundColor() { return null;
};
	public void setDrawsBackground(Boolean flag) { return ;
};
	public Boolean drawsBackground() { return null;
};
	public void setTextColor(NSColor color) { return ;
};
	public NSColor textColor() { return null;
};
	public Boolean isBordered() { return null;
};
	public void setBordered(Boolean flag) { return ;
};
	public Boolean isBezeled() { return null;
};
	public void setBezeled(Boolean flag) { return ;
};
	public Boolean isEditable() { return null;
};
	public void setEditable(Boolean flag) { return ;
};
	public Boolean isSelectable() { return null;
};
	public void setSelectable(Boolean flag) { return ;
};
	public void selectText(NSObject sender) { return ;
};
	public NSObject delegate() { return null;
};
	public void setDelegate(NSObject anObject) { return ;
};
	public Boolean textShouldBeginEditing(NSText textObject) { return null;
};
	public Boolean textShouldEndEditing(NSText textObject) { return null;
};
	public void textDidBeginEditing(NSNotification notification) { return ;
};
	public void textDidEndEditing(NSNotification notification) { return ;
};
	public void textDidChange(NSNotification notification) { return ;
};
	public Boolean acceptsFirstResponder() { return null;
};
	public void setTitleWithMnemonic(String stringWithAmpersand) { return ;
};
	public Boolean allowsEditingTextAttributes() { return null;
};
	public void setAllowsEditingTextAttributes(Boolean flag) { return ;
};
	public Boolean importsGraphics() { return null;
};
	public void setImportsGraphics(Boolean flag) { return ;
};
}
