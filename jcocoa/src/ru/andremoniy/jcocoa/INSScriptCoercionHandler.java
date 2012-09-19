package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSObject;

public abstract class INSScriptCoercionHandler extends NSObject {

	protected NSObject _coercers;

	public NSObject coerceValue(NSObject value, Class toClass) { return null;
};
	public void registerCoercer(NSObject coercer, SEL selector, Class fromClass, Class toClass) { return ;
};
}
