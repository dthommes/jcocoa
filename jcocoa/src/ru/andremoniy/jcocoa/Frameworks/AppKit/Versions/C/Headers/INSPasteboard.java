package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSFileWrapper.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;

public abstract class INSPasteboard {
	public Boolean writeFileContents(String filename) { return null;
};
	public String readFileContentsType(String type, String filename) { return null;
};
	public Boolean writeFileWrapper(NSFileWrapper wrapper) { return null;
};
	public NSFileWrapper readFileWrapper() { return null;
};
	public static String NSPasteboardTypeString;
	public static String NSPasteboardTypePDF;
	public static String NSPasteboardTypeTIFF;
	public static String NSPasteboardTypePNG;
	public static String NSPasteboardTypeRTF;
	public static String NSPasteboardTypeRTFD;
	public static String NSPasteboardTypeHTML;
	public static String NSPasteboardTypeTabularText;
	public static String NSPasteboardTypeFont;
	public static String NSPasteboardTypeRuler;
	public static String NSPasteboardTypeColor;
	public static String NSPasteboardTypeSound;
	public static String NSPasteboardTypeMultipleTextSelection;
	public static String NSPasteboardTypeFindPanelSearchOptions;
	public static String NSGeneralPboard;
	public static String NSFontPboard;
	public static String NSRulerPboard;
	public static String NSFindPboard;
	public static String NSDragPboard;
	public static String NSPasteboardURLReadingFileURLsOnlyKey;
	public static String NSPasteboardURLReadingContentsConformToTypesKey;
	public static String NSStringPboardType;
	public static String NSFilenamesPboardType;
	public static String NSTIFFPboardType;
	public static String NSRTFPboardType;
	public static String NSTabularTextPboardType;
	public static String NSFontPboardType;
	public static String NSRulerPboardType;
	public static String NSColorPboardType;
	public static String NSRTFDPboardType;
	public static String NSHTMLPboardType;
	public static String NSURLPboardType;
	public static String NSPDFPboardType;
	public static String NSMultipleTextSelectionPboardType;
	public static String NSPostScriptPboardType;
	public static String NSVCardPboardType;
	public static String NSInkTextPboardType;
	public static String NSFilesPromisePboardType;
	public static String NSFileContentsPboardType;
	public static String NSCreateFilenamePboardType;
	public static String NSCreateFileContentsPboardType;
	public static String NSGetFileType;
	public static NSArray NSGetFileTypes;
	public static String NSPICTPboardType;
public abstract static class INSObject {
	public void pasteboard(NSPasteboard sender, String type) { return ;
};
	public void pasteboardChangedOwner(NSPasteboard sender) { return ;
};

}
public abstract static class INSURL {
	public void writeToPasteboard(NSPasteboard pasteBoard) { return ;
};

}
}
