package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSObject;

public abstract class INSWindowAnimationContext extends NSObject {

	protected NSObject _window;
	protected NSRect _targetRect;
	protected NSRect _stepRect;
	protected int _stepCount;
	protected NSTimeInterval _stepInterval;
	protected Boolean _display;

	public NSObject initWithWindow(NSObject window, NSRect targetRect, NSRect stepRect, int stepCount, NSTimeInterval stepInterval, Boolean display) { return null;
};
	public NSObject window() { return null;
};
	public NSRect targetRect() { return null;
};
	public NSRect stepRect() { return null;
};
	public int stepCount() { return null;
};
	public NSTimeInterval stepInterval() { return null;
};
	public Boolean display() { return null;
};
	public void decrement() { return ;
};
	public NSRect frame() { return null;
};
	public void setFrame(NSRect frame, Boolean display) { return ;
};
}
