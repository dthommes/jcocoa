package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSWindowScripting.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSDrawer.INSWindow.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSURL.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSPasteboard.INSURL.*;

public abstract class INSSavePanel {
	public String filename() { return null;
};
	public String directory() { return null;
};
	public void setDirectory(String path) { return ;
};
	public String requiredFileType() { return null;
};
	public void setRequiredFileType(String type) { return ;
};
	public void beginSheetForDirectory(String path, String name, NSWindow docWindow, NSObject delegate, SEL didEndSelector, void contextInfo) { return ;
};
	public Integer runModalForDirectory(String path, String name) { return null;
};
	public void selectText(NSObject sender) { return ;
};
	public abstract class NSOpenSavePanelDelegate {
	
}
public static Integer NSFileHandlingPanelCancelButton = NSCancelButton;
public static Integer NSFileHandlingPanelOKButton = NSOKButton;

	public static class __SPFlags {
		Integer saveMode;
		Integer isExpanded;
		Integer allowsOtherFileTypes;
		Integer canCreateDirectories;
		Integer canSelectedHiddenExtension;
		Integer inConfigureForDirectory;
		Integer delegate_shouldShowFilename;
		Integer delegate_compareFilename;
		Integer delegate_shouldEnableURL;
		Integer delegate_validateURL;
		Integer delegate_didChangeToDirectoryURL;
		Integer changingFrameSize;
		Integer movingAccessoryView;
		Integer userAccessoryViewFrameChange;
		Integer reserved;
	}
	public abstract class NSOpenSavePanelDelegate {
	public Boolean panel(NSObject sender, NSURL url) { return null;
};
	public Boolean panel(NSObject sender, NSURL url, NSError outError) { return null;
};
	public void panel(NSObject sender, NSURL url) { return ;
};
	public String panel(NSObject sender, String filename, Boolean okFlag) { return null;
};
	public void panel(NSObject sender, Boolean expanding) { return ;
};
	public void panelSelectionDidChange(NSObject sender) { return ;
};
	
}
public abstract static class INSObject {
	public Boolean panel(NSObject sender, String filename) { return null;
};
	public void panel(NSObject sender, String path) { return ;
};
	public NSComparisonResult panel(NSObject sender, String name1, String name2, Boolean caseSensitive) { return null;
};
	public Boolean panel(NSObject sender, String filename) { return null;
};

}
}
