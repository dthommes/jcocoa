package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSOpenGLPixelFormat;
import static ns.NSOpenGLPixelFormat.*;
import ns.INSOpenGLPixelFormat;
import static ns.INSOpenGLPixelFormat.*;

import ns.NSOpenGLDrawable;

public abstract class INSOpenGLDrawable_X11 extends NSOpenGLDrawable {

	protected NSOpenGLPixelFormat _format;
	protected Display _display;
	protected XVisualInfo _visualInfo;
	protected Window _window;
	protected Window _lastParent;

}
