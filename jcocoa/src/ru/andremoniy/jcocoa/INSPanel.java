package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

import ns.NSWindow;

public abstract class INSPanel extends NSWindow {
public static Integer NSAlertDefaultReturn = 1;
public static Integer NSAlertAlternateReturn = 0;
public static Integer NSAlertOtherReturn = -1;
public static Integer NSAlertErrorReturn = -2;
public static Integer NSOKButton = 1;
public static Integer NSCancelButton = 0;
public static Integer NSUtilityWindowMask = 1;
public static Integer NSDocModalWindowMask = 1;
	public Boolean isFloatingPanel() { return null;
};
	public void setFloatingPanel(Boolean flag) { return ;
};
	public Boolean becomesKeyOnlyIfNeeded() { return null;
};
	public void setBecomesKeyOnlyIfNeeded(Boolean flag) { return ;
};
	public Boolean worksWhenModal() { return null;
};
	public void setWorksWhenModal(Boolean flag) { return ;
};
}
