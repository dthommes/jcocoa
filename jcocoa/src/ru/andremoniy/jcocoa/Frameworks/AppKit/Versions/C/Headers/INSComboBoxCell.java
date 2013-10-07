package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSButtonCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSButtonCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSButtonCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSButtonCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSTableView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSScrollView;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSScrollView.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSArray.INSMutableArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSComboBoxCell.*;

public abstract class INSComboBoxCell extends NSTextFieldCell {

	protected NSObject _delegate;
	protected NSObject _dataSource;


	protected NSButtonCell _buttonCell;
	protected NSTableView _tableView;
	protected NSScrollView _scrollView;
	protected NSWindow _popUp;
	protected NSMutableArray _popUpList;
	protected NSRect _cellFrame;
	protected Void _reserved;

	public Boolean hasVerticalScroller() { return null;
};
	public void setHasVerticalScroller(Boolean flag) { return ;
};
	public NSSize intercellSpacing() { return null;
};
	public void setIntercellSpacing(NSSize aSize) { return ;
};
	public Double itemHeight() { return null;
};
	public void setItemHeight(Double itemHeight) { return ;
};
	public Integer numberOfVisibleItems() { return null;
};
	public void setNumberOfVisibleItems(Integer visibleItems) { return ;
};
	public void reloadData() { return ;
};
	public void noteNumberOfItemsChanged() { return ;
};
	public void setUsesDataSource(Boolean flag) { return ;
};
	public Boolean usesDataSource() { return null;
};
	public void scrollItemAtIndexToTop(Integer index) { return ;
};
	public void scrollItemAtIndexToVisible(Integer index) { return ;
};
	public void selectItemAtIndex(Integer index) { return ;
};
	public void deselectItemAtIndex(Integer index) { return ;
};
	public Integer indexOfSelectedItem() { return null;
};
	public Integer numberOfItems() { return null;
};
	public Boolean completes() { return null;
};
	public void setCompletes(Boolean completes) { return ;
};
	public String completedString(String string) { return null;
};
	public NSObject dataSource() { return null;
};
	public void setDataSource(NSObject aSource) { return ;
};
	public void addItemWithObjectValue(NSObject object) { return ;
};
	public void addItemsWithObjectValues(NSArray objects) { return ;
};
	public void insertItemWithObjectValue(NSObject object, Integer index) { return ;
};
	public void removeItemWithObjectValue(NSObject object) { return ;
};
	public void removeItemAtIndex(Integer index) { return ;
};
	public void removeAllItems() { return ;
};
	public void selectItemWithObjectValue(NSObject object) { return ;
};
	public NSObject itemObjectValueAtIndex(Integer index) { return null;
};
	public NSObject objectValueOfSelectedItem() { return null;
};
	public Integer indexOfItemWithObjectValue(NSObject object) { return null;
};
	public NSArray objectValues() { return null;
};
	public abstract class NSComboBoxCellDataSource {
	
}
	public abstract class NSComboBoxCellDataSource {
	public Integer numberOfItemsInComboBoxCell(NSComboBoxCell comboBoxCell) { return null;
};
	public NSObject comboBoxCell(NSComboBoxCell aComboBoxCell, Integer index) { return null;
};
	public Integer comboBoxCell(NSComboBoxCell aComboBoxCell, String string) { return null;
};
	public String comboBoxCell(NSComboBoxCell aComboBoxCell, String uncompletedString) { return null;
};
	
}
}
