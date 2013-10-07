package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSSliderCell {
	public void setNumberOfTickMarks(Integer count) { return ;
};
	public Integer numberOfTickMarks() { return null;
};
	public void setTickMarkPosition(NSTickMarkPosition position) { return ;
};
	public NSTickMarkPosition tickMarkPosition() { return null;
};
	public void setAllowsTickMarkValuesOnly(Boolean yorn) { return ;
};
	public Boolean allowsTickMarkValuesOnly() { return null;
};
	public double tickMarkValueAtIndex(Integer index) { return null;
};
	public NSRect rectOfTickMarkAtIndex(Integer index) { return null;
};
	public Integer indexOfTickMarkAtPoint(NSPoint point) { return null;
};
	public double closestTickMarkValueToValue(double value) { return null;
};
public static Integer NSTickMarkBelow = 0;
public static Integer NSTickMarkAbove = 1;
public static Integer NSTickMarkLeft = NSTickMarkAbove;
public static Integer NSTickMarkRight = NSTickMarkBelow;

	public static class NSTickMarkPosition extends NSUInteger { }}
