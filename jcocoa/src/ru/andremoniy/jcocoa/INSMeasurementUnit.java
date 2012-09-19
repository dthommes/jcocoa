package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSMeasurementUnit extends NSObject {

	protected String _name;
	protected String _abbreviation;
	protected double _pointsPerUnit;
	protected NSArray _stepUpCycle;
	protected NSArray _stepDownCycle;

	public NSObject initWithName(String name, String abbreviation, double points, NSArray upCycle, NSArray downCycle) { return null;
};
	public String name() { return null;
};
	public String abbreviation() { return null;
};
	public double pointsPerUnit() { return null;
};
	public NSArray stepUpCycle() { return null;
};
	public NSArray stepDownCycle() { return null;
};
}
