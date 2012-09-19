package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSFont;
import static ns.NSFont.*;
import ns.INSFont;
import static ns.INSFont.*;
import ns.NSAttributedString;
import static ns.NSAttributedString.*;
import ns.INSAttributedString;
import static ns.INSAttributedString.*;

import ns.NSActionCell;

public abstract class INSFormCell extends NSActionCell {

	protected Double _titleWidth;
	protected NSObject _titleCell;
	protected Double _titleEndPoint;

	public NSObject initTextCell(String aString) { return null;
};
	public Double titleWidth(NSSize aSize) { return null;
};
	public Double titleWidth() { return null;
};
	public void setTitleWidth(Double width) { return ;
};
	public String title() { return null;
};
	public void setTitle(String aString) { return ;
};
	public NSFont titleFont() { return null;
};
	public void setTitleFont(NSFont fontObj) { return ;
};
	public NSTextAlignment titleAlignment() { return null;
};
	public void setTitleAlignment(NSTextAlignment mode) { return ;
};
	public Boolean isOpaque() { return null;
};
	public void setTitleWithMnemonic(String stringWithAmpersand) { return ;
};
	public NSAttributedString attributedTitle() { return null;
};
	public void setAttributedTitle(NSAttributedString obj) { return ;
};
}
