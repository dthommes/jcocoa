package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSFont;
import static ns.NSFont.*;
import ns.INSFont;
import static ns.INSFont.*;
import ns.NSFormCell;
import static ns.NSFormCell.*;
import ns.INSFormCell;
import static ns.INSFormCell.*;

import ns.NSMatrix;

public abstract class INSForm extends NSMatrix {
	public Integer indexOfSelectedItem() { return null;
};
	public void setEntryWidth(Double width) { return ;
};
	public void setInterlineSpacing(Double spacing) { return ;
};
	public void setBordered(Boolean flag) { return ;
};
	public void setBezeled(Boolean flag) { return ;
};
	public void setTitleAlignment(NSTextAlignment mode) { return ;
};
	public void setTextAlignment(NSTextAlignment mode) { return ;
};
	public void setTitleFont(NSFont fontObj) { return ;
};
	public void setTextFont(NSFont fontObj) { return ;
};
	public NSObject cellAtIndex(Integer index) { return null;
};
	public void drawCellAtIndex(Integer index) { return ;
};
	public NSFormCell addEntry(String title) { return null;
};
	public NSFormCell insertEntry(String title, Integer index) { return null;
};
	public void removeEntryAtIndex(Integer index) { return ;
};
	public Integer indexOfCellWithTag(Integer aTag) { return null;
};
	public void selectTextAtIndex(Integer index) { return ;
};
	public void setFrameSize(NSSize newSize) { return ;
};
}
