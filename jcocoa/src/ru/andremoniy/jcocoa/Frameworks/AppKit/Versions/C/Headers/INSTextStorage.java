package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;

public abstract class INSTextStorage extends NSMutableAttributedString {

	protected NSRange _editedRange;
	protected Integer _editedDelta;


	protected NSMutableArray _layoutManagers;
	protected NSObject _sideData;

	public void addLayoutManager(NSLayoutManager obj) { return ;
};
	public void removeLayoutManager(NSLayoutManager obj) { return ;
};
	public NSArray layoutManagers() { return null;
};
	public void edited(Integer editedMask, NSRange range, Integer delta) { return ;
};
	public void processEditing() { return ;
};
	public void invalidateAttributesInRange(NSRange range) { return ;
};
	public void ensureAttributesAreFixedInRange(NSRange range) { return ;
};
	public Boolean fixesAttributesLazily() { return null;
};
	public Integer editedMask() { return null;
};
	public NSRange editedRange() { return null;
};
	public Integer changeInLength() { return null;
};
	public void setDelegate(NSObject delegate) { return ;
};
	public NSObject delegate() { return null;
};
	public abstract class NSTextStorageDelegate {
	
}
public static Integer NSTextStorageEditedAttributes = 1;
public static Integer NSTextStorageEditedCharacters = 2;
	public abstract class NSTextStorageDelegate {
	public void textStorageWillProcessEditing(NSNotification notification) { return ;
};
	public void textStorageDidProcessEditing(NSNotification notification) { return ;
};
	
}
	public static String NSTextStorageWillProcessEditingNotification;
	public static String NSTextStorageDidProcessEditingNotification;
}
