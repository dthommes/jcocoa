package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;

public abstract class INSFontManager {
	public Boolean fontNamed(String fName, NSFontTraitMask someTraits) { return null;
};
	public NSArray availableFontNamesWithTraits(NSFontTraitMask someTraits) { return null;
};
	public void addFontTrait(NSObject sender) { return ;
};
	public void removeFontTrait(NSObject sender) { return ;
};
	public void modifyFontViaPanel(NSObject sender) { return ;
};
	public void modifyFont(NSObject sender) { return ;
};
	public void orderFrontFontPanel(NSObject sender) { return ;
};

	public static class NSFontTraitMask extends NSUInteger { }public static Integer NSItalicFontMask = 0x00000001;
public static Integer NSBoldFontMask = 0x00000002;
public static Integer NSUnboldFontMask = 0x00000004;
public static Integer NSNonStandardCharacterSetFontMask = 0x00000008;
public static Integer NSNarrowFontMask = 0x00000010;
public static Integer NSExpandedFontMask = 0x00000020;
public static Integer NSCondensedFontMask = 0x00000040;
public static Integer NSSmallCapsFontMask = 0x00000080;
public static Integer NSPosterFontMask = 0x00000100;
public static Integer NSCompressedFontMask = 0x00000200;
public static Integer NSFixedPitchFontMask = 0x00000400;
public static Integer NSUnitalicFontMask = 0x01000000;
public static Integer NSNoFontChangeAction = 0;
public static Integer NSViaPanelFontAction = 1;
public static Integer NSAddTraitFontAction = 2;
public static Integer NSSizeUpFontAction = 3;
public static Integer NSSizeDownFontAction = 4;
public static Integer NSHeavierFontAction = 5;
public static Integer NSLighterFontAction = 6;
public static Integer NSRemoveTraitFontAction = 7;

	public static class NSFontAction extends NSUInteger { }public abstract static class INSObject {
	public Boolean fontManager(NSObject sender, String fontName) { return null;
};

}
public abstract static class INSObject {
	public void changeFont(NSObject sender) { return ;
};

}
}
