package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSScrollView;
import static ns.NSScrollView.*;
import ns.INSScrollView;
import static ns.INSScrollView.*;
import ns.NSView;
import static ns.NSView.*;
import ns.INSView;
import static ns.INSView.*;
import ns.NSMutableArray;
import static ns.NSMutableArray.*;
import ns.INSMutableArray;
import static ns.INSMutableArray.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSRulerMarker;
import static ns.NSRulerMarker.*;
import ns.INSRulerMarker;
import static ns.INSRulerMarker.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSEvent;
import static ns.NSEvent.*;
import ns.INSEvent;
import static ns.INSEvent.*;
import ns.NSRulerView;
import static ns.NSRulerView.*;
import ns.INSRulerView;
import static ns.INSRulerView.*;

import ns.NSView;

public abstract class INSRulerView extends NSView {
public static Integer NSHorizontalRuler = null;
public static Integer NSVerticalRuler = null;

	public static class NSRulerOrientation extends NSUInteger { }
	protected NSScrollView _scrollView;
	protected NSRulerOrientation _orientation;
	protected String _units;
	protected Double _originOffset;
	protected Double _ruleThickness;
	protected Double _thicknessForMarkers;
	protected Double _thicknessForAccessoryView;
	protected NSView _clientView;
	protected NSMutableArray _markers;
	protected NSView _accessoryView;
	protected NSDictionary _cachedHashDict;
	protected Double _cachedDocViewToRulerConversion;
	protected NSPoint _cachedContentBoundsOrigin;
	protected NSRulerMarker _draggingMarker;
	protected NSObject _reservedRulerView1;

	public NSObject initWithScrollView(NSScrollView scrollView, NSRulerOrientation orientation) { return null;
};
	public void setScrollView(NSScrollView scrollView) { return ;
};
	public NSScrollView scrollView() { return null;
};
	public void setOrientation(NSRulerOrientation orientation) { return ;
};
	public NSRulerOrientation orientation() { return null;
};
	public Double baselineLocation() { return null;
};
	public Double requiredThickness() { return null;
};
	public void setRuleThickness(Double thickness) { return ;
};
	public Double ruleThickness() { return null;
};
	public void setReservedThicknessForMarkers(Double thickness) { return ;
};
	public Double reservedThicknessForMarkers() { return null;
};
	public void setReservedThicknessForAccessoryView(Double thickness) { return ;
};
	public Double reservedThicknessForAccessoryView() { return null;
};
	public void setMeasurementUnits(String unitName) { return ;
};
	public String measurementUnits() { return null;
};
	public void setOriginOffset(Double offset) { return ;
};
	public Double originOffset() { return null;
};
	public void setClientView(NSView client) { return ;
};
	public NSView clientView() { return null;
};
	public void setMarkers(NSArray markers) { return ;
};
	public void addMarker(NSRulerMarker marker) { return ;
};
	public void removeMarker(NSRulerMarker marker) { return ;
};
	public NSArray markers() { return null;
};
	public Boolean trackMarker(NSRulerMarker marker, NSEvent event) { return null;
};
	public void setAccessoryView(NSView accessory) { return ;
};
	public NSView accessoryView() { return null;
};
	public void moveRulerlineFromLocation(Double oldLocation, Double newLocation) { return ;
};
	public void invalidateHashMarks() { return ;
};
	public void drawHashMarksAndLabelsInRect(NSRect rect) { return ;
};
	public void drawMarkersInRect(NSRect rect) { return ;
};
	public Boolean isFlipped() { return null;
};
	public Boolean rulerView(NSRulerView ruler, NSRulerMarker marker) { return null;
};
	public Double rulerView(NSRulerView ruler, NSRulerMarker marker, Double location) { return null;
};
	public void rulerView(NSRulerView ruler, NSRulerMarker marker) { return ;
};
	public Boolean rulerView(NSRulerView ruler, NSRulerMarker marker) { return null;
};
	public void rulerView(NSRulerView ruler, NSRulerMarker marker) { return ;
};
	public Boolean rulerView(NSRulerView ruler, NSRulerMarker marker) { return null;
};
	public Double rulerView(NSRulerView ruler, NSRulerMarker marker, Double location) { return null;
};
	public void rulerView(NSRulerView ruler, NSRulerMarker marker) { return ;
};
	public void rulerView(NSRulerView ruler, NSEvent event) { return ;
};
	public void rulerView(NSRulerView ruler, NSView newClient) { return ;
};
}
