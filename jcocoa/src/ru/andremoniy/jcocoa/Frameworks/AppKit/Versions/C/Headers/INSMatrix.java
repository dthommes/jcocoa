package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSCell.*;

public abstract class INSMatrix {
	public void setTabKeyTraversesCells(Boolean flag) { return ;
};
	public Boolean tabKeyTraversesCells() { return null;
};
	public void setKeyCell(NSCell keyCell) { return ;
};
	public NSObject keyCell() { return null;
};
	public abstract class NSMatrixDelegate {
	
}
public static Integer NSRadioModeMatrix = 0;
public static Integer NSHighlightModeMatrix = 1;
public static Integer NSListModeMatrix = 2;
public static Integer NSTrackModeMatrix = 3;

	public static class NSMatrixMode extends NSUInteger { }
	public static class _MFlags {
		Integer reservedMatrix;
		Integer drawingContextMenuHighlightOnAllSelectedRows;
		Integer drawingContextMenuHighlight;
		Integer browserOptimizationsEnabled;
		Integer needsRedrawBeforeFirstLiveResizeCache;
		Integer tmpAllowNonVisibleCellsToBecomeFirstResponder;
		Integer subclassIsSafeForLiveResize;
		Integer hasCachedSubclassIsSafeForLiveResize;
		Integer liveResizeImageCacheingEnabled;
		Integer checkForSimpleTrackingMode;
		Integer useSimpleTrackingMode;
		Integer refusesFirstResponder;
		Integer dontScroll;
		Integer changingSelectionWithKeyboard;
		Integer onlySetKeyCell;
		Integer currentlySelectingCell;
		Integer allowsIncrementalSearching;
		Integer tabKeyTraversesCellsExplicitlySet;
		Integer tabKeyTraversesCells;
		Integer drawingAncestor;
		Integer autosizeCells;
		Integer drawsBackground;
		Integer drawsCellBackground;
		Integer selectionByRect;
		Integer autoscroll;
		Integer allowEmptySel;
		Integer listMode;
		Integer radioMode;
		Integer highlightMode;
	}
	public abstract class NSMatrixDelegate {
	
}
}
