package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSColorPickerWheelView;
import static ns.NSColorPickerWheelView.*;
import ns.INSColorPickerWheelView;
import static ns.INSColorPickerWheelView.*;
import ns.NSView;
import static ns.NSView.*;
import ns.INSView;
import static ns.INSView.*;
import ns.NSSlider;
import static ns.NSSlider.*;
import ns.INSSlider;
import static ns.INSSlider.*;

import ns.NSColorPicker;

public abstract class INSColorPickerWheel extends NSColorPicker {

	protected NSView currentView;
	protected NSColorPickerWheelView _wheelView;
	protected NSSlider valueSlider;

}
