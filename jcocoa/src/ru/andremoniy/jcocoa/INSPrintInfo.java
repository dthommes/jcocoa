package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSMutableDictionary;
import static ns.NSMutableDictionary.*;
import ns.INSMutableDictionary;
import static ns.INSMutableDictionary.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSPrinter;
import static ns.NSPrinter.*;
import ns.INSPrinter;
import static ns.INSPrinter.*;

import ns.NSObject;

public abstract class INSPrintInfo extends NSObject {
public static Integer NSPortraitOrientation = 0;
public static Integer NSLandscapeOrientation = 1;

	public static class NSPrintingOrientation extends NSUInteger { }public static Integer NSAutoPagination = 0;
public static Integer NSFitPagination = 1;
public static Integer NSClipPagination = 2;

	public static class NSPrintingPaginationMode extends NSUInteger { }
	protected NSMutableDictionary _attributes;
	protected NSObject _moreVars;

	public NSObject initWithDictionary(NSDictionary attributes) { return null;
};
	public NSMutableDictionary dictionary() { return null;
};
	public void setPaperName(String name) { return ;
};
	public void setPaperSize(NSSize size) { return ;
};
	public void setOrientation(NSPrintingOrientation orientation) { return ;
};
	public void setScalingFactor(Double scalingFactor) { return ;
};
	public String paperName() { return null;
};
	public NSSize paperSize() { return null;
};
	public NSPrintingOrientation orientation() { return null;
};
	public Double scalingFactor() { return null;
};
	public void setLeftMargin(Double margin) { return ;
};
	public void setRightMargin(Double margin) { return ;
};
	public void setTopMargin(Double margin) { return ;
};
	public void setBottomMargin(Double margin) { return ;
};
	public Double leftMargin() { return null;
};
	public Double rightMargin() { return null;
};
	public Double topMargin() { return null;
};
	public Double bottomMargin() { return null;
};
	public void setHorizontallyCentered(Boolean flag) { return ;
};
	public void setVerticallyCentered(Boolean flag) { return ;
};
	public Boolean isHorizontallyCentered() { return null;
};
	public Boolean isVerticallyCentered() { return null;
};
	public void setHorizontalPagination(NSPrintingPaginationMode mode) { return ;
};
	public void setVerticalPagination(NSPrintingPaginationMode mode) { return ;
};
	public NSPrintingPaginationMode horizontalPagination() { return null;
};
	public NSPrintingPaginationMode verticalPagination() { return null;
};
	public void setJobDisposition(String disposition) { return ;
};
	public String jobDisposition() { return null;
};
	public void setPrinter(NSPrinter printer) { return ;
};
	public NSPrinter printer() { return null;
};
	public void setUpPrintOperationDefaultValues() { return ;
};
	public void setSelectionOnly(Boolean selectionOnly) { return ;
};
	public Boolean isSelectionOnly() { return null;
};
}
