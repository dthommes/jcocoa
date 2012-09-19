package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSOpenGLContext;
import static ns.NSOpenGLContext.*;
import ns.INSOpenGLContext;
import static ns.INSOpenGLContext.*;
import static ns.INSOpenGLContext.NSOpenGLContextParameter.*;
import ns.NSOpenGLPixelFormat;
import static ns.NSOpenGLPixelFormat.*;
import ns.INSOpenGLPixelFormat;
import static ns.INSOpenGLPixelFormat.*;

import ns.NSView;

public abstract class INSOpenGLView extends NSView {

	protected NSOpenGLContext _openGLContext;
	protected NSOpenGLPixelFormat _pixelFormat;
	protected Integer _reserved1;
	protected Integer _reserved2;
	protected Integer _reserved3;

	public NSObject initWithFrame(NSRect frameRect, NSOpenGLPixelFormat format) { return null;
};
	public void setOpenGLContext(NSOpenGLContext context) { return ;
};
	public NSOpenGLContext openGLContext() { return null;
};
	public void clearGLContext() { return ;
};
	public void update() { return ;
};
	public void reshape() { return ;
};
	public void setPixelFormat(NSOpenGLPixelFormat pixelFormat) { return ;
};
	public NSOpenGLPixelFormat pixelFormat() { return null;
};
}
