package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImageRep;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImageRep.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage.*;
import ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage;
import static ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers.INSImage.*;

public abstract class INSImage {
	public void setFlipped(Boolean flag) { return ;
};
	public Boolean isFlipped() { return null;
};
	public void dissolveToPoint(NSPoint point, Double aFloat) { return ;
};
	public void dissolveToPoint(NSPoint point, NSRect rect, Double aFloat) { return ;
};
	public void compositeToPoint(NSPoint point, NSCompositingOperation op) { return ;
};
	public void compositeToPoint(NSPoint point, NSRect rect, NSCompositingOperation op) { return ;
};
	public void compositeToPoint(NSPoint point, NSCompositingOperation op, Double delta) { return ;
};
	public void compositeToPoint(NSPoint point, NSRect rect, NSCompositingOperation op, Double delta) { return ;
};
	public void lockFocusOnRepresentation(NSImageRep imageRepresentation) { return ;
};
	public void setScalesWhenResized(Boolean flag) { return ;
};
	public Boolean scalesWhenResized() { return null;
};
	public void setDataRetained(Boolean flag) { return ;
};
	public Boolean isDataRetained() { return null;
};
	public void setCachedSeparately(Boolean flag) { return ;
};
	public Boolean isCachedSeparately() { return null;
};
	public void setCacheDepthMatchesImageDepth(Boolean flag) { return ;
};
	public Boolean cacheDepthMatchesImageDepth() { return null;
};
	public abstract class NSImageDelegate {
	
}
	public static String NSImageHintCTM;
	public static String NSImageHintInterpolation;
	public abstract class NSImageDelegate {
	public NSImage imageDidNotDraw(NSObject sender, NSRect aRect) { return null;
};
	
}
	public static String NSImageNameQuickLookTemplate;
	public static String NSImageNameBluetoothTemplate;
	public static String NSImageNameIChatTheaterTemplate;
	public static String NSImageNameSlideshowTemplate;
	public static String NSImageNameActionTemplate;
	public static String NSImageNameSmartBadgeTemplate;
	public static String NSImageNameIconViewTemplate;
	public static String NSImageNameListViewTemplate;
	public static String NSImageNameColumnViewTemplate;
	public static String NSImageNameFlowViewTemplate;
	public static String NSImageNamePathTemplate;
	public static String NSImageNameInvalidDataFreestandingTemplate;
	public static String NSImageNameLockLockedTemplate;
	public static String NSImageNameLockUnlockedTemplate;
	public static String NSImageNameGoRightTemplate;
	public static String NSImageNameGoLeftTemplate;
	public static String NSImageNameRightFacingTriangleTemplate;
	public static String NSImageNameLeftFacingTriangleTemplate;
	public static String NSImageNameAddTemplate;
	public static String NSImageNameRemoveTemplate;
	public static String NSImageNameRevealFreestandingTemplate;
	public static String NSImageNameFollowLinkFreestandingTemplate;
	public static String NSImageNameEnterFullScreenTemplate;
	public static String NSImageNameExitFullScreenTemplate;
	public static String NSImageNameStopProgressTemplate;
	public static String NSImageNameStopProgressFreestandingTemplate;
	public static String NSImageNameRefreshTemplate;
	public static String NSImageNameRefreshFreestandingTemplate;
	public static String NSImageNameBonjour;
	public static String NSImageNameComputer;
	public static String NSImageNameFolderBurnable;
	public static String NSImageNameFolderSmart;
	public static String NSImageNameFolder;
	public static String NSImageNameNetwork;
	public static String NSImageNameDotMac;
	public static String NSImageNameMobileMe;
	public static String NSImageNameMultipleDocuments;
	public static String NSImageNameUserAccounts;
	public static String NSImageNamePreferencesGeneral;
	public static String NSImageNameAdvanced;
	public static String NSImageNameInfo;
	public static String NSImageNameFontPanel;
	public static String NSImageNameColorPanel;
	public static String NSImageNameUser;
	public static String NSImageNameUserGroup;
	public static String NSImageNameEveryone;
	public static String NSImageNameUserGuest;
	public static String NSImageNameMenuOnStateTemplate;
	public static String NSImageNameMenuMixedStateTemplate;
	public static String NSImageNameApplicationIcon;
	public static String NSImageNameTrashEmpty;
	public static String NSImageNameTrashFull;
	public static String NSImageNameHomeTemplate;
	public static String NSImageNameBookmarksTemplate;
	public static String NSImageNameCaution;
	public static String NSImageNameStatusAvailable;
	public static String NSImageNameStatusPartiallyAvailable;
	public static String NSImageNameStatusUnavailable;
	public static String NSImageNameStatusNone;
public abstract static class INSBundle {
	public String pathForImageResource(String name) { return null;
};
	public NSURL URLForImageResource(String name) { return null;
};

}
}
