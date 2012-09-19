package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSColorPickerWheelView;
import static ns.NSColorPickerWheelView.*;
import ns.INSColorPickerWheelView;
import static ns.INSColorPickerWheelView.*;

import ns.NSView;

public abstract class INSColorPickerWheelView extends NSView {

	protected NSObject _delegate;
	protected NSPoint _handleLocation;
	protected Double _hueValue;
	protected Double _saturationValue;
	protected Double _brightnessValue;

	public void setHue(Double hue) { return ;
};
	public Double hue() { return null;
};
	public void setSaturation(Double saturation) { return ;
};
	public Double saturation() { return null;
};
	public void setBrightness(Double brightness) { return ;
};
	public Double brightness() { return null;
};
	public void brightnessChanged(NSObject sender) { return ;
};
	public void colorPickerWheelView(NSColorPickerWheelView view, Double hue, Double saturation, Double brightness) { return ;
};
}
