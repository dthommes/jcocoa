package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSData;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSData.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCharacterSet;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCharacterSet.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCharacterSet;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSCharacterSet.*;

public abstract class INSCharacterSet extends NSObject {
	public Boolean characterIsMember(Characted aCharacter) { return null;
};
	public NSData bitmapRepresentation() { return null;
};
	public NSCharacterSet invertedSet() { return null;
};
public static Integer NSOpenStepUnicodeReservedBase = 0xF400;
public abstract static class INSMutableCharacterSet extends NSCharacterSet {
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
}
