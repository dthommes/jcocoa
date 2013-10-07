package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSColor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSRulerView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSClipView.INSView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCursor.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSEvent;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSEvent.*;

public abstract class INSClipView extends NSView {

	protected NSColor _backgroundColor;
	protected NSView _docView;
	protected NSRect _docRect;
	protected NSRect _oldDocFrame;
	protected NSCursor _cursor;
	protected NSObject _scrollAnimationHelper;

	public void setBackgroundColor(NSColor color) { return ;
};
	public NSColor backgroundColor() { return null;
};
	public void setDrawsBackground(Boolean flag) { return ;
};
	public Boolean drawsBackground() { return null;
};
	public void setDocumentView(NSView aView) { return ;
};
	public NSObject documentView() { return null;
};
	public NSRect documentRect() { return null;
};
	public void setDocumentCursor(NSCursor anObj) { return ;
};
	public NSCursor documentCursor() { return null;
};
	public NSRect documentVisibleRect() { return null;
};
	public void viewFrameChanged(NSNotification notification) { return ;
};
	public void viewBoundsChanged(NSNotification notification) { return ;
};
	public void setCopiesOnScroll(Boolean flag) { return ;
};
	public Boolean copiesOnScroll() { return null;
};
	public Boolean autoscroll(NSEvent theEvent) { return null;
};
	public NSPoint constrainScrollPoint(NSPoint newOrigin) { return null;
};
	public void scrollToPoint(NSPoint newOrigin) { return ;
};
public abstract static class INSView {
	public void reflectScrolledClipView(NSClipView aClipView) { return ;
};
	public void scrollClipView(NSClipView aClipView, NSPoint aPoint) { return ;
};

}
}
