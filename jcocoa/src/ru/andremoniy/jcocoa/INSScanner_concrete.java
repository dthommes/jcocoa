package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSCharacterSet;
import static ns.NSCharacterSet.*;
import ns.INSCharacterSet;
import static ns.INSCharacterSet.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSScanner;

public abstract class INSScanner_concrete extends NSScanner {

	protected String _string;
	protected Integer _location;
	protected NSCharacterSet _skipSet;
	protected Boolean _isCaseSensitive;
	protected NSDictionary _locale;

}
