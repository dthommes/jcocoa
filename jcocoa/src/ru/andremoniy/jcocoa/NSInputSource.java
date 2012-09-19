package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static ru.andremoniy.cocoa.MathEx.*;
import static ru.andremoniy.cocoa.Utils.*;
import static ru.andremoniy.cocoa.NSException.*;
import static ru.andremoniy.cocoa.Constants.*;


public class NSInputSource extends INSInputSource {
public  Boolean isValid() { return true; } 

public  void invalidate() { } 

public  Boolean processInputImmediately() { return false; } 


	public NSInputSource init() {
		return this;
	}


	public NSInputSource autorelease() {
		return this; // TODO 
	}

}
