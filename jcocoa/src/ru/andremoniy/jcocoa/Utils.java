package ru.andremoniy.cocoa;

import java.util.List;

/**
 * User: 1
 * Date: 25.08.12
 * Time: 9:45
 */
public class Utils {

    public static boolean NSEqualRects(Object obj1, Object obj2) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMinX(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMinY(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMidX(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMaxX(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMidY(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Double NSMaxY(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static String NSLocalizedString(String s1, String s2) {
        throw new RuntimeException("not implemented");
    }

    public static void LogEvent_(NSEvent event, String msg, Object... objs) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg, Object obj, Exception ex) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg, Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg) {
        throw new RuntimeException("not implemented");
    }

    public static NSSize NSMakeSize(double width, double height) {
        throw new RuntimeException("not implemented");
    }

    public static NSPoint NSMakePoint(double x, double y) {
        throw new RuntimeException("not implemented");
    }

    public static void NSBeep() {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSContainsRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static int LineLength(NSPoint point1, NSPoint point2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSEqualPoints(NSPoint point1, NSPoint point2) {
        throw new RuntimeException("not implemented");
    }

    public static void NSAssert(boolean condition, String msg) {
        assert condition : msg;
    }

    public static NSRect NSRectFromTwoPoints(NSPoint p1, NSPoint p2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSIntersectsRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSMouseInRect(NSPoint point, NSRect rect, boolean isFlipped) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSRectCentredOnPoint(NSPoint point, NSSize size) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSEqualSizes(NSSize size1, NSSize size2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSMakeRect(float x1, float y1, float width, float height) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSMakeRect(double x1, double y1, double width, double height) {
        throw new RuntimeException("not implemented");
    }

    public static NSSet DifferenceOfTwoRects(NSRect r1, NSRect r2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSIsEmptyRect(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static String NSHomeDirectory() {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSInsetRect(NSRect rect, Double x, Double y) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSInsetRect(NSRect rect, int x, int y) {
        throw new RuntimeException("not implemented");
    }

    public static NSRange NSMakeRange(int i1, int i2) {
        throw new RuntimeException("not implemented");
    }

    public static String NSStringFromPoint(NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSPointInRect(NSPoint point, NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSOffsetRect(NSRect rect, double v1, double v2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSUnionRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSIntersectionRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static String NSStringFromClass(Class clazz) {
        throw new RuntimeException("not implemented");
    }

    public static enum NSBezierPathElementEnum {
        NSMoveToBezierPathElement,
        NSLineToBezierPathElement,
        NSCurveToBezierPathElement,
        NSClosePathBezierPathElement
    }

    public static enum kDKArcPathEnum {
        kDKArcPathRadiusPart,
        kDKArcPathStartAnglePart,
        kDKArcPathEndAnglePart,
        kDKArcPathRotationKnobPart
    }

    public static <T extends Enum> T getEnum(Object obj) {
        switch (obj.getClass().getName()) {
            case "NSBezierPathElement":
                return (T) NSBezierPathElementEnum.valueOf(obj.toString());
//            case "Integer":
//                return kDKArcPathEnum;
        }
        return null;
    }

    public static boolean wrapIf(boolean value) {
        return value;
    }

    public static boolean logic(Boolean value) {
        return value;
    }

    public static boolean logic(Number number) {
        return number != null && number.intValue() != 0;
    }

    public static boolean logic(Object obj) {
        return obj != null;
    }

    public static boolean _not(Boolean value) {
        return !value;
    }

    public static boolean _not(Number number) {
        return !logic(number);
    }

    public static boolean _not(Object obj) {
        return !logic(obj);
    }

    public static SEL _selector_(String name) {
        throw new RuntimeException("not implemented");
    }

    public static <T> T objc_msgSend(Object object, String methodName, List<String> categories, Object... msgList) {
        try {
            // TODO: using categories
            Class[] classes = new Class[msgList.length];
            for (int i = 0, msgListLength = msgList.length; i < msgListLength; i++) {
                Object msg = msgList[i];
                classes[i] = msg.getClass();
            }
            return (T) object.getClass().getMethod(methodName, classes).invoke(object, msgList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T obcj_field(Object object, String fieldName) {
        try {
            return (T) object.getClass().getDeclaredField(fieldName).get(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean _notEquals(Object obj1, Object obj2) {
        if (obj1 == null) {
            return obj2 != null;
        } else {
            return !obj1.equals(obj2);
        }
    }

    public static boolean _equals(Object obj1, Object obj2) {
        if (obj1 == null) {
            return obj2 == null;
        } else {
            return obj1.equals(obj2);
        }
    }

    public static Double _minus(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() - ((Number) obj2).doubleValue();
    }

    public static Double _plus(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
    }

    public static Double _divide(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
    }

    public static Double _multiple(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
    }

    public static boolean _more(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue();
    }

    public static boolean _moreEquals(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue() || _equals(obj1, obj2);
    }

    public static boolean _less(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue();
    }

    public static boolean _lessEquals(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue() || _equals(obj1, obj2);
    }

    public static boolean _andAnd(Object obj1, Object obj2) {
        return (Boolean) obj1 && (Boolean) obj2;
    }

    public static boolean _orOr(Object obj1, Object obj2) {
        return (Boolean) obj1 || (Boolean) obj2;
    }

    public static String NSStringFromSize(NSSize size) {
        throw new RuntimeException("not implemented");
    }

}



