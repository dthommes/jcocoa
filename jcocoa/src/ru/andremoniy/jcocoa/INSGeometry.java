package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

public abstract class INSValue {

	public static class  {
		Double x;
		Double y;
	}

	public static class NSPointPointer extends NSPoint { }
	public static class NSPointArray extends NSPoint { }
	public static class  {
		Double width;
		Double height;
	}

	public static class NSSizePointer extends NSSize { }
	public static class NSSizeArray extends NSSize { }
	public static class  {
		NSPoint origin;
		NSSize size;
	}

	public static class NSRectPointer extends NSRect { }
	public static class NSRectArray extends NSRect { }
	public enum NSRectEdge {
		NSMinXEdge,
		NSMinYEdge,
		NSMaxXEdge,
		NSMaxYEdge
	}
	public NSPoint pointValue() { return null;
};
	public NSSize sizeValue() { return null;
};
	public NSRect rectValue() { return null;
};
	public void encodePoint(NSPoint point) { return ;
};
	public NSPoint decodePoint() { return null;
};
	public void encodeSize(NSSize size) { return ;
};
	public NSSize decodeSize() { return null;
};
	public void encodeRect(NSRect rect) { return ;
};
	public NSRect decodeRect() { return null;
};
	public void encodePoint(NSPoint point, String key) { return ;
};
	public void encodeSize(NSSize size, String key) { return ;
};
	public void encodeRect(NSRect rect, String key) { return ;
};
	public NSPoint decodePointForKey(String key) { return null;
};
	public NSSize decodeSizeForKey(String key) { return null;
};
	public NSRect decodeRectForKey(String key) { return null;
};
}
