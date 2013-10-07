package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSMethodSignature;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSMethodSignature.*;

public abstract class INSInvocation extends NSObject {

	protected Void _frame;
	protected Void _retdata;
	protected NSObject _signature;
	protected NSObject _container;
	protected uint8_t _retainedArgs;
	protected uint8_t _reserved;

	public NSMethodSignature methodSignature() { return null;
};
	public void retainArguments() { return ;
};
	public Boolean argumentsRetained() { return null;
};
	public NSObject target() { return null;
};
	public void setTarget(NSObject target) { return ;
};
	public SEL selector() { return null;
};
	public void setSelector(SEL selector) { return ;
};
	public void getReturnValue(void retLoc) { return ;
};
	public void setReturnValue(void retLoc) { return ;
};
	public void getArgument(void argumentLocation, Integer idx) { return ;
};
	public void setArgument(void argumentLocation, Integer idx) { return ;
};
	public void invoke() { return ;
};
	public void invokeWithTarget(NSObject target) { return ;
};
}
