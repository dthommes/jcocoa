package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSGeometry {

    public static class _NSPoint {
        Double x;
        Double y;
    }

    public static class NSPointPointer extends NSPoint {
    }

    public static class NSPointArray extends NSPoint {
    }

    public static class _NSSize {
        Double width;
        Double height;
    }

    public static class NSSizePointer extends NSSize {
    }

    public static class NSSizeArray extends NSSize {
    }

    public static class NSRect {
        NSPoint origin;
        NSSize size;
    }

    public static class NSRectPointer extends NSRect {
    }

    public static class NSRectArray extends NSRect {
    }

    public enum NSRectEdge {
        NSMinXEdge,
        NSMinYEdge,
        NSMaxXEdge,
        NSMaxYEdge
    }

    public static NSPoint NSZeroPoint;
    public static NSSize NSZeroSize;
    public static NSRect NSZeroRect;
    public static NSPoint NSEqualPoints;
    public static NSSize NSEqualSizes;
    public static NSRect NSEqualRects;
    public static NSRect NSIsEmptyRect;
    public static Double NSInsetRect;
    public static NSRect NSIntegralRect;
    public static NSRect NSUnionRect;
    public static NSRect NSIntersectionRect;
    public static Double NSOffsetRect;
    public static NSRectEdge NSDivideRect;
    public static NSRect NSPointInRect;
    public static Boolean NSMouseInRect;
    public static NSRect NSContainsRect;
    public static NSRect NSIntersectsRect;
    public static NSPoint NSStringFromPoint;
    public static NSSize NSStringFromSize;
    public static NSRect NSStringFromRect;
    public static String NSPointFromString;
    public static String NSSizeFromString;
    public static String NSRectFromString;

    public abstract static class INSValue {
        public NSPoint pointValue() {
            return null;
        }

        ;

        public NSSize sizeValue() {
            return null;
        }

        ;

        public NSRect rectValue() {
            return null;
        }

        ;

    }

    public abstract static class INSCoder {
        public void encodePoint(NSPoint point) {
            return;
        }

        ;

        public NSPoint decodePoint() {
            return null;
        }

        ;

        public void encodeSize(NSSize size) {
            return;
        }

        ;

        public NSSize decodeSize() {
            return null;
        }

        ;

        public void encodeRect(NSRect rect) {
            return;
        }

        ;

        public NSRect decodeRect() {
            return null;
        }

        ;

    }

}
