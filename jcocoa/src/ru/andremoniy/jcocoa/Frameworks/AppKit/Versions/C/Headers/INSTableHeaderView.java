package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView.*;

public abstract class INSTableHeaderView extends NSView {

	protected NSTableView _tableView;
	protected Integer _resizedColumn;
	protected Integer _draggedColumn;
	protected Integer _pressedColumn;
	protected NSImage _headerDragImage;
	protected Double _draggedDistance;
	protected Boolean _isColumnResizing;
	protected Boolean _showHandCursorFired;
	protected Boolean _toolTipRectsDirty;
	protected Boolean _alignTitleWithDataCell;
	protected Boolean _skipDrawingSeparator;
	protected NSObject _reserved;

	public void setTableView(NSTableView tableView) { return ;
};
	public NSTableView tableView() { return null;
};
	public Integer draggedColumn() { return null;
};
	public Double draggedDistance() { return null;
};
	public Integer resizedColumn() { return null;
};
	public NSRect headerRectOfColumn(Integer column) { return null;
};
	public Integer columnAtPoint(NSPoint point) { return null;
};
}
