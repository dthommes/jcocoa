package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSNibOutletConnector;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static ru.andremoniy.jcocoa.MathEx.*;
import static ru.andremoniy.jcocoa.Utils.*;
import static ru.andremoniy.jcocoa.NSException.*;
import static ru.andremoniy.jcocoa.Constants.*;


public class NSNibOutletConnector extends INSNibOutletConnector {
public  void establishConnection() { String  methodName = objc_msgSend(String.class,"stringWithFormat", null, "set%@:",objc_msgSend(_label,"capitalizedString", null)); SEL selector = NSSelectorFromString ( methodName); if (logic(_notEquals(selector ,NULL))) if (logic(objc_msgSend(_source,"respondsToSelector", null, selector))) { objc_msgSend(_source,"performSelector", null, selector, _destination); return ; } object_setInstanceVariable ( _source, objc_msgSend(_label,"cString", null), & _destination) ; } 


	public NSNibOutletConnector init() {
		return this;
	}


	public NSNibOutletConnector autorelease() {
		return this; // TODO 
	}

}
