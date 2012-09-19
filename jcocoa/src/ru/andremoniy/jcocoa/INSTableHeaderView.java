package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSTableView;
import static ns.NSTableView.*;
import ns.INSTableView;
import static ns.INSTableView.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;

import ns.NSView;

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
