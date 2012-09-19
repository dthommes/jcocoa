package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSUndoManager;
import static ns.NSUndoManager.*;
import ns.INSUndoManager;
import static ns.INSUndoManager.*;

import ns.NSUndoManager;

public abstract class INSCellUndoManager extends NSUndoManager {

	protected NSUndoManager _nextUndoManager;

	public Boolean canUndo() { return null;
};
	public void undo() { return ;
};
	public Boolean canRedo() { return null;
};
	public void redo() { return ;
};
	public void setNextUndoManager(NSUndoManager manager) { return ;
};
}
