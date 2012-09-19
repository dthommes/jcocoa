package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSMutableSet;
import static ns.NSMutableSet.*;
import ns.INSMutableSet;
import static ns.INSMutableSet.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;

import ns.NSObject;

public abstract class INSSpellCheckerTagData extends NSObject {

	protected NSMutableSet _ignoredWords;

	public void ignoreWord(String word) { return ;
};
	public NSArray ignoredWords() { return null;
};
	public void setIgnoredWords(NSArray words) { return ;
};
}
