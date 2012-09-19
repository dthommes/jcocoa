package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static ru.andremoniy.cocoa.MathEx.*;
import static ru.andremoniy.cocoa.Utils.*;
import static ru.andremoniy.cocoa.NSException.*;
import static ru.andremoniy.cocoa.Constants.*;


public class NSInterfacePart extends INSInterfacePart {
public  NSSize size() { return NSZeroSize; } 

public  void drawAtPoint(NSPoint point) { } 


	public NSInterfacePart init() {
		return this;
	}


	public NSInterfacePart autorelease() {
		return this; // TODO 
	}

}
