package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;

public abstract class INSParagraphStyle extends NSObject {

	protected Double _lineSpacing;
	protected Double _paragraphSpacing;
	protected Double _headIndent;
	protected Double _tailIndent;
	protected Double _firstLineHeadIndent;
	protected Double _minimumLineHeight;
	protected Double _maximumLineHeight;
	protected NSArray _tabStops;


	protected Double _defaultTabInterval;
	protected NSObject _extraData;

	public Double lineSpacing() { return null;
};
	public Double paragraphSpacing() { return null;
};
	public NSTextAlignment alignment() { return null;
};
	public Double headIndent() { return null;
};
	public Double tailIndent() { return null;
};
	public Double firstLineHeadIndent() { return null;
};
	public NSArray tabStops() { return null;
};
	public Double minimumLineHeight() { return null;
};
	public Double maximumLineHeight() { return null;
};
	public NSLineBreakMode lineBreakMode() { return null;
};
public static Integer NSLeftTabStopType = 0;
public static Integer NSRightTabStopType = null;
public static Integer NSCenterTabStopType = null;
public static Integer NSDecimalTabStopType = null;

	public static class NSTextTabType extends NSUInteger { }public static Integer NSLineBreakByWordWrapping = 0;
public static Integer NSLineBreakByCharWrapping = null;
public static Integer NSLineBreakByClipping = null;
public static Integer NSLineBreakByTruncatingHead = null;
public static Integer NSLineBreakByTruncatingTail = null;
public static Integer NSLineBreakByTruncatingMiddle = null;

	public static class NSLineBreakMode extends NSUInteger { }public abstract static class INSTextTab extends NSObject {

	protected Double _location;
	protected NSObject _reserved;

	public NSObject initWithType(NSTextTabType type, Double loc) { return null;
};
	public Double location() { return null;
};
	public NSTextTabType tabStopType() { return null;
};

}
public abstract static class INSMutableParagraphStyle extends NSParagraphStyle {
	public void setLineSpacing(Double aFloat) { return ;
};
	public void setParagraphSpacing(Double aFloat) { return ;
};
	public void setAlignment(NSTextAlignment alignment) { return ;
};
	public void setFirstLineHeadIndent(Double aFloat) { return ;
};
	public void setHeadIndent(Double aFloat) { return ;
};
	public void setTailIndent(Double aFloat) { return ;
};
	public void setLineBreakMode(NSLineBreakMode mode) { return ;
};
	public void setMinimumLineHeight(Double aFloat) { return ;
};
	public void setMaximumLineHeight(Double aFloat) { return ;
};
	public void addTabStop(NSTextTab anObject) { return ;
};
	public void removeTabStop(NSTextTab anObject) { return ;
};
	public void setTabStops(NSArray array) { return ;
};
	public void setParagraphStyle(NSParagraphStyle obj) { return ;
};

}
}
