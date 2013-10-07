package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSScriptStandardSuiteCommands {
public static Integer NSSaveOptionsYes = 0;
public static Integer NSSaveOptionsNo = null;
public static Integer NSSaveOptionsAsk = null;

	public static class NSSaveOptions extends NSUInteger { }public abstract static class INSCloneCommand extends NSScriptCommand {

	protected NSScriptObjectSpecifier _keySpecifier;

	public void setReceiversSpecifier(NSScriptObjectSpecifier receiversRef) { return ;
};
	public NSScriptObjectSpecifier keySpecifier() { return null;
};

}
public abstract static class INSCloseCommand extends NSScriptCommand {
	public NSSaveOptions saveOptions() { return null;
};

}
public abstract static class INSCountCommand extends NSScriptCommand {

}
public abstract static class INSCreateCommand extends NSScriptCommand {

	protected NSObject _moreVars2;

	public NSScriptClassDescription createClassDescription() { return null;
};
	public NSDictionary resolvedKeyDictionary() { return null;
};

}
public abstract static class INSDeleteCommand extends NSScriptCommand {

	protected NSScriptObjectSpecifier _keySpecifier;

	public void setReceiversSpecifier(NSScriptObjectSpecifier receiversRef) { return ;
};
	public NSScriptObjectSpecifier keySpecifier() { return null;
};

}
public abstract static class INSExistsCommand extends NSScriptCommand {

}
public abstract static class INSGetCommand extends NSScriptCommand {

}
public abstract static class INSMoveCommand extends NSScriptCommand {

	protected NSScriptObjectSpecifier _keySpecifier;

	public void setReceiversSpecifier(NSScriptObjectSpecifier receiversRef) { return ;
};
	public NSScriptObjectSpecifier keySpecifier() { return null;
};

}
public abstract static class INSQuitCommand extends NSScriptCommand {
	public NSSaveOptions saveOptions() { return null;
};

}
public abstract static class INSSetCommand extends NSScriptCommand {

	protected NSScriptObjectSpecifier _keySpecifier;

	public void setReceiversSpecifier(NSScriptObjectSpecifier receiversRef) { return ;
};
	public NSScriptObjectSpecifier keySpecifier() { return null;
};

}
}
