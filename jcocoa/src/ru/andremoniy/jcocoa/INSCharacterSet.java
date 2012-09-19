package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSCharacterSet;
import static ns.NSCharacterSet.*;
import ns.INSCharacterSet;
import static ns.INSCharacterSet.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;

import ns.NSObject;

public abstract class INSCharacterSet extends NSObject {
public static Integer NSOpenStepUnicodeReservedBase = 0xF400;
	public Boolean characterIsMember(unichar aCharacter) { return null;
};
	public NSData bitmapRepresentation() { return null;
};
	public NSCharacterSet invertedSet() { return null;
};
	public void addCharactersInRange(NSRange aRange) { return ;
};
	public void removeCharactersInRange(NSRange aRange) { return ;
};
	public void addCharactersInString(String aString) { return ;
};
	public void removeCharactersInString(String aString) { return ;
};
	public void formUnionWithCharacterSet(NSCharacterSet otherSet) { return ;
};
	public void formIntersectionWithCharacterSet(NSCharacterSet otherSet) { return ;
};
	public void invert() { return ;
};
}
