package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static ru.andremoniy.jcocoa.MathEx.*;
import static ru.andremoniy.jcocoa.Utils.*;
import static ru.andremoniy.jcocoa.NSException.*;
import static ru.andremoniy.jcocoa.Constants.*;


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
