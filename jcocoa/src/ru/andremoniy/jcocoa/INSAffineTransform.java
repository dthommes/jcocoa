package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSAffineTransform;
import static ns.NSAffineTransform.*;
import ns.INSAffineTransform;
import static ns.INSAffineTransform.*;

import ns.NSObject;

public abstract class INSAffineTransform extends NSObject {

	public static class  {
		Double m22;
		Double tY;
	}

	protected NSAffineTransformStruct _transformStruct;

	public NSObject initWithTransform(NSAffineTransform transform) { return null;
};
	public void translateXBy(Double deltaX, Double deltaY) { return ;
};
	public void rotateByDegrees(Double angle) { return ;
};
	public void rotateByRadians(Double angle) { return ;
};
	public void scaleBy(Double scale) { return ;
};
	public void scaleXBy(Double scaleX, Double scaleY) { return ;
};
	public void invert() { return ;
};
	public void appendTransform(NSAffineTransform transform) { return ;
};
	public void prependTransform(NSAffineTransform transform) { return ;
};
	public NSPoint transformPoint(NSPoint aPoint) { return null;
};
	public NSSize transformSize(NSSize aSize) { return null;
};
	public NSAffineTransformStruct transformStruct() { return null;
};
	public void setTransformStruct(NSAffineTransformStruct transformStruct) { return ;
};
}
