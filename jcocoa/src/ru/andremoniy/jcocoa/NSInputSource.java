package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static ru.andremoniy.jcocoa.MathEx.*;
import static ru.andremoniy.jcocoa.Utils.*;
import static ru.andremoniy.jcocoa.NSException.*;
import static ru.andremoniy.jcocoa.Constants.*;


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
