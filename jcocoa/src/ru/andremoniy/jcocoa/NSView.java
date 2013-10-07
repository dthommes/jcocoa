package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSGeometry;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:17
 */
public class NSView extends NSObject {
    private boolean flipped;

    public boolean needsToDrawRect(INSGeometry.NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public void visibleRect() {
        throw new RuntimeException("not implemented");
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void scrollPoint(NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public void interpretKeyEvents(NSArray keyEvents) {
        throw new RuntimeException("not implemented");
    }

    public void autoscroll(NSEvent event) {
        throw new RuntimeException("not implemented");
    }

    public void scrollWheel(NSEvent event) {
        throw new RuntimeException("not implemented");
    }

    public void mouseUp(NSEvent theEvent) {
        throw new RuntimeException("not implemented");
    }

    public NSPoint convertPoint(NSPoint p, Object o) {
        throw new RuntimeException("not implemented");
    }

    public NSWindow window() {
        throw new RuntimeException("not implemented");
    }

    public NSView superview() {
        throw new RuntimeException("not implemented");
    }

    public NSScrollView enclosingScrollView() {
        throw new RuntimeException("not implemented");
    }

    public void unregisterDraggedTypes() {
        throw new RuntimeException("not implemented");
    }

    public void registerForDraggedTypes(NSArray types) {
        throw new RuntimeException("not implemented");
    }
}
