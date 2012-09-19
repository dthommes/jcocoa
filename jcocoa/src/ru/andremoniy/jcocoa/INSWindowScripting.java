package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

public abstract class INSWindow {
	public Boolean hasCloseBox() { return null;
};
	public Boolean hasTitleBar() { return null;
};
	public Boolean isFloatingPanel() { return null;
};
	public Boolean isMiniaturizable() { return null;
};
	public Boolean isModalPanel() { return null;
};
	public Boolean isResizable() { return null;
};
	public Boolean isZoomable() { return null;
};
	public Integer orderedIndex() { return null;
};
	public void setIsMiniaturized(Boolean flag) { return ;
};
	public void setIsVisible(Boolean flag) { return ;
};
	public void setIsZoomed(Boolean flag) { return ;
};
	public void setOrderedIndex(Integer index) { return ;
};
	public NSObject handleCloseScriptCommand(NSCloseCommand command) { return null;
};
	public NSObject handlePrintScriptCommand(NSScriptCommand command) { return null;
};
	public NSObject handleSaveScriptCommand(NSScriptCommand command) { return null;
};
}
