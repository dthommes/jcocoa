package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSScriptCoercionHandler {

	protected NSObject _coercers;

	public NSObject coerceValue(NSObject value, Class toClass) { return null;
};
	public void registerCoercer(NSObject coercer, SEL selector, Class fromClass, Class toClass) { return ;
};
}
