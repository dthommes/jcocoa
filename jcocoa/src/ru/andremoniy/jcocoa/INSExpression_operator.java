package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSExpression;

public abstract class INSExpression_operator extends NSExpression {

	public enum  {
		NSExpressionOperatorNegate
	}

	protected NSExpressionOperator _operator;
	protected NSArray _arguments;

	public NSArray arguments() { return null;
};
}
