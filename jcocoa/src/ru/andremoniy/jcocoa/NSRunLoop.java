package ru.andremoniy.cocoa;

/**
 * User: 1
 * Date: 25.08.12
 * Time: 9:49
 */
public class NSRunLoop {

    public static int NSDefaultRunLoopMode = 0;
    public static int NSEventTrackingRunLoopMode = 1;

    public static NSRunLoop currentRunLoop() {
        throw new RuntimeException("not implemented");
    }

    public void addTimer(NSTimer timer, int mode) {
        throw new RuntimeException("not implemented");
    }
}
