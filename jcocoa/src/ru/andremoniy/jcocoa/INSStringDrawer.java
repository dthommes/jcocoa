package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSTextStorage;
import static ns.NSTextStorage.*;
import ns.INSTextStorage;
import static ns.INSTextStorage.*;
import ns.NSLayoutManager;
import static ns.NSLayoutManager.*;
import ns.INSLayoutManager;
import static ns.INSLayoutManager.*;
import ns.NSTextContainer;
import static ns.NSTextContainer.*;
import ns.INSTextContainer;
import static ns.INSTextContainer.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSAttributedString;
import static ns.NSAttributedString.*;
import ns.INSAttributedString;
import static ns.INSAttributedString.*;

import ns.NSObject;

public abstract class INSStringDrawer extends NSObject {

	protected NSTextStorage _textStorage;
	protected NSLayoutManager _layoutManager;
	protected NSTextContainer _textContainer;

	public NSSize sizeOfString(String string, NSDictionary attributes, NSSize maxSize) { return null;
};
	public void drawString(String string, NSDictionary attributes, NSRect rect) { return ;
};
	public void drawString(String string, NSDictionary attributes, NSPoint point, NSSize maxSize) { return ;
};
	public NSSize sizeOfAttributedString(NSAttributedString astring, NSSize maxSize) { return null;
};
	public void drawAttributedString(NSAttributedString astring, NSRect rect) { return ;
};
	public void drawAttributedString(NSAttributedString astring, NSPoint point, NSSize maxSize) { return ;
};
	public void _clipAndDrawInRect(NSRect rect, NSDictionary attributes, Boolean truncateTail) { return ;
};
	public void _clipAndDrawInRect(NSRect rect, NSDictionary attributes) { return ;
};
	public void _clipAndDrawInRect(NSRect rect, Boolean truncateTail) { return ;
};
	public void _clipAndDrawInRect(NSRect rect) { return ;
};
}
