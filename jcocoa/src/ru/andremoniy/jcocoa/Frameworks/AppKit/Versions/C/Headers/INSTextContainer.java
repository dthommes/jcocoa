package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSLayoutManager.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTextView.*;

public abstract class INSTextContainer extends NSObject {

	protected NSLayoutManager _layoutManager;
	protected NSTextView _textView;
	protected NSSize _size;
	protected Double _lineFragmentPadding;

	public NSObject initWithContainerSize(NSSize size) { return null;
};
	public NSLayoutManager layoutManager() { return null;
};
	public void setLayoutManager(NSLayoutManager layoutManager) { return ;
};
	public void replaceLayoutManager(NSLayoutManager newLayoutManager) { return ;
};
	public NSTextView textView() { return null;
};
	public void setTextView(NSTextView textView) { return ;
};
	public void setWidthTracksTextView(Boolean flag) { return ;
};
	public Boolean widthTracksTextView() { return null;
};
	public void setHeightTracksTextView(Boolean flag) { return ;
};
	public Boolean heightTracksTextView() { return null;
};
	public void setContainerSize(NSSize size) { return ;
};
	public NSSize containerSize() { return null;
};
	public void setLineFragmentPadding(Double pad) { return ;
};
	public Double lineFragmentPadding() { return null;
};
	public NSRect lineFragmentRectForProposedRect(NSRect proposedRect, NSLineSweepDirection sweepDirection, NSLineMovementDirection movementDirection, NSRectPointer remainingRect) { return null;
};
	public Boolean isSimpleRectangularTextContainer() { return null;
};
	public Boolean containsPoint(NSPoint point) { return null;
};
public static Integer NSLineSweepLeft = 0;
public static Integer NSLineSweepRight = 1;
public static Integer NSLineSweepDown = 2;
public static Integer NSLineSweepUp = 3;

	public static class NSLineSweepDirection extends NSUInteger { }public static Integer NSLineDoesntMove = 0;
public static Integer NSLineMovesLeft = 1;
public static Integer NSLineMovesRight = 2;
public static Integer NSLineMovesDown = 3;
public static Integer NSLineMovesUp = 4;

	public static class NSLineMovementDirection extends NSUInteger { }}
