package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSPathUtilities.INSArray.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL.*;

public abstract class INSDocumentController {
	public NSArray fileExtensionsFromType(String typeName) { return null;
};
	public String typeFromFileExtension(String fileNameExtensionOrHFSFileType) { return null;
};
	public NSObject documentForFileName(String fileName) { return null;
};
	public NSArray fileNamesFromRunningOpenPanel() { return null;
};
	public NSObject makeDocumentWithContentsOfFile(String fileName, String type) { return null;
};
	public NSObject makeDocumentWithContentsOfURL(NSURL url, String type) { return null;
};
	public NSObject makeUntitledDocumentOfType(String type) { return null;
};
	public NSObject openDocumentWithContentsOfFile(String fileName, Boolean display) { return null;
};
	public NSObject openDocumentWithContentsOfURL(NSURL url, Boolean display) { return null;
};
	public NSObject openUntitledDocumentOfType(String type, Boolean display) { return null;
};
	public void setShouldCreateUI(Boolean flag) { return ;
};
	public Boolean shouldCreateUI() { return null;
};
}
