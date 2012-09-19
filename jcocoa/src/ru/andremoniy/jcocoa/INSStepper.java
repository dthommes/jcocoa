package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSControl;

public abstract class INSStepper extends NSControl {

	protected int _reserved1;
	protected int _reserved2;
	protected int _reserved3;
	protected int _reserved4;

	public double minValue() { return null;
};
	public void setMinValue(double minValue) { return ;
};
	public double maxValue() { return null;
};
	public void setMaxValue(double maxValue) { return ;
};
	public double increment() { return null;
};
	public void setIncrement(double increment) { return ;
};
	public Boolean valueWraps() { return null;
};
	public void setValueWraps(Boolean valueWraps) { return ;
};
	public Boolean autorepeat() { return null;
};
	public void setAutorepeat(Boolean autorepeat) { return ;
};
}
