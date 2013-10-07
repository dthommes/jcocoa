package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;

public abstract class INSEnumerator {
	public NSArray allObjects() { return null;
};

	public static class NSFastEnumerationState {
		Long state;
		NSObject itemsPtr;
		Long mutationsPtr;
		Long extra;
	}
	public abstract class NSFastEnumeration {
	public Integer countByEnumeratingWithState(NSFastEnumerationState state, NSObject stackbuf, Integer len) { return null;
};
	
}
}
