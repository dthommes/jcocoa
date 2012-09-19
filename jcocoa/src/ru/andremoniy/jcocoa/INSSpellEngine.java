package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSOrthography;
import static ns.NSOrthography.*;
import ns.INSOrthography;
import static ns.INSOrthography.*;

import ns.NSObject;

public abstract class INSSpellEngine extends NSObject {
	public String vendor() { return null;
};
	public NSArray languages() { return null;
};
	public NSRange checkGrammarInString(String string, String language, NSArray outDetails) { return null;
};
	public NSArray checkString(String stringToCheck, Integer offset, NSTextCheckingTypes checkingTypes, NSDictionary options, NSOrthography orthography, Integer wordCount) { return null;
};
	public void didForgetWord(String word, String language) { return ;
};
	public void didLearnWord(String word, String language) { return ;
};
	public NSRange findMisspelledWordInString(String stringToCheck, String language, Integer wordCount, Boolean countOnly) { return null;
};
	public NSArray suggestCompletionsForPartialWordRange(NSRange range, String string, String language) { return null;
};
	public NSArray suggestGuessesForWord(String word, String language) { return null;
};
}
