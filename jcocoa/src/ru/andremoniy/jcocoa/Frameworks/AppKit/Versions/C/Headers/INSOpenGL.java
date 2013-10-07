package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSOpenGL {

	public enum NSOpenGLGlobalOption {
		NSOpenGLGOFormatCacheSize,
		NSOpenGLGOClearFormatCache,
		NSOpenGLGORetainRenderers,
		NSOpenGLGOResetLibrary
	}
	public static GLint NSOpenGLSetOption;
	public static GLint NSOpenGLGetOption;
	public static GLint NSOpenGLGetVersion;
public static Integer NSOpenGLPFAAllRenderers = 1;
public static Integer NSOpenGLPFADoubleBuffer = 5;
public static Integer NSOpenGLPFAStereo = 6;
public static Integer NSOpenGLPFAAuxBuffers = 7;
public static Integer NSOpenGLPFAColorSize = 8;
public static Integer NSOpenGLPFAAlphaSize = 11;
public static Integer NSOpenGLPFADepthSize = 12;
public static Integer NSOpenGLPFAStencilSize = 13;
public static Integer NSOpenGLPFAAccumSize = 14;
public static Integer NSOpenGLPFAMinimumPolicy = 51;
public static Integer NSOpenGLPFAMaximumPolicy = 52;
public static Integer NSOpenGLPFAOffScreen = 53;
public static Integer NSOpenGLPFAFullScreen = 54;
public static Integer NSOpenGLPFASampleBuffers = 55;
public static Integer NSOpenGLPFASamples = 56;
public static Integer NSOpenGLPFAAuxDepthStencil = 57;
public static Integer NSOpenGLPFAColorFloat = 58;
public static Integer NSOpenGLPFARendererID = 70;
public static Integer NSOpenGLPFASingleRenderer = 71;
public static Integer NSOpenGLPFANoRecovery = 72;
public static Integer NSOpenGLPFAAccelerated = 73;
public static Integer NSOpenGLPFAClosestPolicy = 74;
public static Integer NSOpenGLPFARobust = 75;
public static Integer NSOpenGLPFABackingStore = 76;
public static Integer NSOpenGLPFAMPSafe = 78;
public static Integer NSOpenGLPFAWindow = 80;
public static Integer NSOpenGLPFAMultiScreen = 81;
public static Integer NSOpenGLPFACompliant = 83;
public static Integer NSOpenGLPFAScreenMask = 84;
public static Integer NSOpenGLPFAPixelBuffer = 90;
public static Integer NSOpenGLPFARemotePixelBuffer = 91;
public static Integer NSOpenGLPFAAcceleratedCompute = 97;
public static Integer NSOpenGLPFAVirtualScreenCount = 128;

	public static class NSOpenGLPixelFormatAttribute extends uint32_t { }
	public static class _CGLPixelFormatObject {
	}

	public enum NSOpenGLContextParameter {
		NSOpenGLCPSwapRectangle,
		NSOpenGLCPSwapRectangleEnable,
		NSOpenGLCPRasterizationEnable,
		NSOpenGLCPSwapInterval,
		NSOpenGLCPStateValidation
	}

	public static class NSOpenGLContextAuxiliary {
	}
public abstract static class INSOpenGLPixelFormat extends NSObject {

	protected NSOpenGLPixelFormatAuxiliary _pixelFormatAuxiliary;
	protected NSData _pixelAttributes;
	protected Integer _reserved1;
	protected Integer _reserved2;
	protected Integer _reserved3;

	public NSObject initWithAttributes(NSOpenGLPixelFormatAttribute attribs) { return null;
};
	public NSObject initWithData(NSData attribs) { return null;
};
	public NSObject initWithCGLPixelFormatObj(void format) { return null;
};
	public NSData attributes() { return null;
};
	public void setAttributes(NSData attribs) { return ;
};
	public void getValues(GLint vals, NSOpenGLPixelFormatAttribute attrib, GLint screen) { return ;
};
	public GLint numberOfVirtualScreens() { return null;
};

}
public abstract static class INSOpenGLContext extends NSObject {

	protected NSView _view;
	protected NSOpenGLContextAuxiliary _contextAuxiliary;

	public NSObject initWithFormat(NSOpenGLPixelFormat format, NSOpenGLContext share) { return null;
};
	public NSObject initWithCGLContextObj(void context) { return null;
};
	public void setView(NSView view) { return ;
};
	public NSView view() { return null;
};
	public void setFullScreen() { return ;
};
	public void setOffScreen(void baseaddr, GLsizei width, GLsizei height, GLint rowbytes) { return ;
};
	public void clearDrawable() { return ;
};
	public void update() { return ;
};
	public void flushBuffer() { return ;
};
	public void makeCurrentContext() { return ;
};
	public void copyAttributesFromContext(NSOpenGLContext context, GLbitfield mask) { return ;
};
	public void setValues(GLint vals, NSOpenGLContextParameter param) { return ;
};
	public void getValues(GLint vals, NSOpenGLContextParameter param) { return ;
};

}
}
