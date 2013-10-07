package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSScriptObjectSpecifiers {
public static Integer NSNoSpecifierError = 0;
public static Integer NSNoTopLevelContainersSpecifierError = null;
public static Integer NSContainerSpecifierError = null;
public static Integer NSUnknownKeySpecifierError = null;
public static Integer NSInvalidIndexSpecifierError = null;
public static Integer NSInternalSpecifierError = null;
public static Integer NSOperationNotSupportedForKeySpecifierError = null;
public static Integer NSPositionAfter = null;
public static Integer NSPositionBefore = null;
public static Integer NSPositionBeginning = null;
public static Integer NSPositionEnd = null;
public static Integer NSPositionReplace = null;

	public static class NSInsertionPosition extends NSUInteger { }public static Integer NSRelativeAfter = 0;
public static Integer NSRelativeBefore = null;

	public static class NSRelativePosition extends NSUInteger { }public static Integer NSIndexSubelement = 0;
public static Integer NSEverySubelement = 1;
public static Integer NSMiddleSubelement = 2;
public static Integer NSRandomSubelement = 3;
public static Integer NSNoSubelement = 4;

	public static class NSWhoseSubelementIdentifier extends NSUInteger { }public abstract static class INSScriptObjectSpecifier extends NSObject {

	protected NSScriptObjectSpecifier _container;
	protected NSScriptObjectSpecifier _child;
	protected String _key;
	protected NSScriptClassDescription _containerClassDescription;
	protected Boolean _containerIsObjectBeingTested;
	protected Boolean _containerIsRangeContainerObject;
	protected char _padding;
	protected NSAppleEventDescriptor _descriptor;
	protected Integer _error;

	public NSObject initWithContainerSpecifier(NSScriptObjectSpecifier container, String property) { return null;
};
	public NSObject initWithContainerClassDescription(NSScriptClassDescription classDesc, NSScriptObjectSpecifier container, String property) { return null;
};
	public NSScriptObjectSpecifier childSpecifier() { return null;
};
	public void setChildSpecifier(NSScriptObjectSpecifier child) { return ;
};
	public NSScriptObjectSpecifier containerSpecifier() { return null;
};
	public void setContainerSpecifier(NSScriptObjectSpecifier subRef) { return ;
};
	public Boolean containerIsObjectBeingTested() { return null;
};
	public void setContainerIsObjectBeingTested(Boolean flag) { return ;
};
	public Boolean containerIsRangeContainerObject() { return null;
};
	public void setContainerIsRangeContainerObject(Boolean flag) { return ;
};
	public String key() { return null;
};
	public void setKey(String key) { return ;
};
	public NSScriptClassDescription containerClassDescription() { return null;
};
	public void setContainerClassDescription(NSScriptClassDescription classDesc) { return ;
};
	public NSScriptClassDescription keyClassDescription() { return null;
};
	public Integer indicesOfObjectsByEvaluatingWithContainer(NSObject container, Integer count) { return null;
};
	public NSObject objectsByEvaluatingWithContainers(NSObject containers) { return null;
};
	public NSObject objectsByEvaluatingSpecifier() { return null;
};
	public Integer evaluationErrorNumber() { return null;
};
	public void setEvaluationErrorNumber(Integer error) { return ;
};
	public NSScriptObjectSpecifier evaluationErrorSpecifier() { return null;
};

}
public abstract static class INSObject {
	public NSScriptObjectSpecifier objectSpecifier() { return null;
};
	public NSArray indicesOfObjectsByEvaluatingObjectSpecifier(NSScriptObjectSpecifier specifier) { return null;
};

}
public abstract static class INSIndexSpecifier extends NSScriptObjectSpecifier {

	protected Integer _index;

	public NSObject initWithContainerClassDescription(NSScriptClassDescription classDesc, NSScriptObjectSpecifier container, String property, Integer index) { return null;
};
	public Integer index() { return null;
};
	public void setIndex(Integer index) { return ;
};

}
public abstract static class INSMiddleSpecifier extends NSScriptObjectSpecifier {

}
public abstract static class INSPositionalSpecifier extends NSObject {

	protected NSScriptObjectSpecifier _specifier;
	protected NSInsertionPosition _unadjustedPosition;
	protected NSScriptClassDescription _insertionClassDescription;
	protected NSObject _moreVars;
	protected Void _reserved0;

	public NSObject initWithPosition(NSInsertionPosition position, NSScriptObjectSpecifier specifier) { return null;
};
	public void evaluate() { return ;
};
	public NSObject insertionContainer() { return null;
};
	public String insertionKey() { return null;
};
	public Integer insertionIndex() { return null;
};

}
public abstract static class INSPropertySpecifier extends NSScriptObjectSpecifier {

}
public abstract static class INSRandomSpecifier extends NSScriptObjectSpecifier {

}
public abstract static class INSRangeSpecifier extends NSScriptObjectSpecifier {

	protected NSScriptObjectSpecifier _startSpec;
	protected NSScriptObjectSpecifier _endSpec;

	public NSObject initWithContainerClassDescription(NSScriptClassDescription classDesc, NSScriptObjectSpecifier container, String property, NSScriptObjectSpecifier startSpec, NSScriptObjectSpecifier endSpec) { return null;
};
	public NSScriptObjectSpecifier startSpecifier() { return null;
};
	public void setStartSpecifier(NSScriptObjectSpecifier startSpec) { return ;
};
	public NSScriptObjectSpecifier endSpecifier() { return null;
};
	public void setEndSpecifier(NSScriptObjectSpecifier endSpec) { return ;
};

}
public abstract static class INSRelativeSpecifier extends NSScriptObjectSpecifier {

	protected NSRelativePosition _relativePosition;
	protected NSScriptObjectSpecifier _baseSpecifier;

	public NSObject initWithContainerClassDescription(NSScriptClassDescription classDesc, NSScriptObjectSpecifier container, String property, NSRelativePosition relPos, NSScriptObjectSpecifier baseSpecifier) { return null;
};
	public NSRelativePosition relativePosition() { return null;
};
	public void setRelativePosition(NSRelativePosition relPos) { return ;
};
	public NSScriptObjectSpecifier baseSpecifier() { return null;
};
	public void setBaseSpecifier(NSScriptObjectSpecifier baseSpecifier) { return ;
};

}
public abstract static class INSWhoseSpecifier extends NSScriptObjectSpecifier {

	protected NSScriptWhoseTest _test;
	protected NSWhoseSubelementIdentifier _startSubelementIdentifier;
	protected Integer _startSubelementIndex;
	protected NSWhoseSubelementIdentifier _endSubelementIdentifier;
	protected Integer _endSubelementIndex;

	public NSObject initWithContainerClassDescription(NSScriptClassDescription classDesc, NSScriptObjectSpecifier container, String property, NSScriptWhoseTest test) { return null;
};
	public NSScriptWhoseTest test() { return null;
};
	public void setTest(NSScriptWhoseTest test) { return ;
};
	public NSWhoseSubelementIdentifier startSubelementIdentifier() { return null;
};
	public void setStartSubelementIdentifier(NSWhoseSubelementIdentifier subelement) { return ;
};
	public Integer startSubelementIndex() { return null;
};
	public void setStartSubelementIndex(Integer index) { return ;
};
	public NSWhoseSubelementIdentifier endSubelementIdentifier() { return null;
};
	public void setEndSubelementIdentifier(NSWhoseSubelementIdentifier subelement) { return ;
};
	public Integer endSubelementIndex() { return null;
};
	public void setEndSubelementIndex(Integer index) { return ;
};

}
}
