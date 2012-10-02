package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:13
 */
public class NSEvent extends NSObject {
    public int type() {
        throw new RuntimeException("not implemented");
    }

    public NSPoint locationInWindow() {
        throw new RuntimeException("not implemented");
    }

    public int clickCount() {
        throw new RuntimeException("not implemented");
    }

    public NSWindow window() {
        throw new RuntimeException("not implemented");
    }

    public boolean modifierFlags() {
        throw new RuntimeException("not implemented");
    }

    public short keyCode() {
        throw new RuntimeException("not implemented");
    }

    public static NSEvent mouseEventWithType(Integer type, Object locationInWindow, int i, Object o, Object windowNumber, NSGraphicsContext nsGraphicsContext, int i1, int i2, double v) {
        throw new RuntimeException("not implemented");
    }
}
