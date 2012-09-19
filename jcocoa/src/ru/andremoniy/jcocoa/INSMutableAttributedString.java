package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSMutableString;
import static ns.NSMutableString.*;
import ns.INSMutableString;
import static ns.INSMutableString.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSAttributedString;
import static ns.NSAttributedString.*;
import ns.INSAttributedString;
import static ns.INSAttributedString.*;

import ns.NSAttributedString;

public abstract class INSMutableAttributedString extends NSAttributedString {
	public NSMutableString mutableString() { return null;
};
	public void addAttribute(String name, NSObject value, NSRange range) { return ;
};
	public void addAttributes(NSDictionary attributes, NSRange range) { return ;
};
	public void appendAttributedString(NSAttributedString attributedString) { return ;
};
	public void deleteCharactersInRange(NSRange range) { return ;
};
	public void removeAttribute(String name, NSRange range) { return ;
};
	public void insertAttributedString(NSAttributedString attributedString, Integer index) { return ;
};
	public void replaceCharactersInRange(NSRange range, String string) { return ;
};
	public void replaceCharactersInRange(NSRange range, NSAttributedString attributedString) { return ;
};
	public void setAttributes(NSDictionary attributes, NSRange range) { return ;
};
	public void setAttributedString(NSAttributedString attributedString) { return ;
};
	public void beginEditing() { return ;
};
	public void endEditing() { return ;
};
}
