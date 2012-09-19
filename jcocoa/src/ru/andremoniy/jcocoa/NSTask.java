package ru.andremoniy.jcocoa;

/**
 * User: 1
 * Date: 25.08.12
 * Time: 20:45
 */
public class NSTask {
    public NSTask init() {
        return new NSTask();
    }

    public void setLaunchPath(String path) {
        throw new RuntimeException("not implemented");
    }

    public void launch() {
        throw new RuntimeException("not implemented");
    }

    public void waitUntilExit() {
        throw new RuntimeException("not implemented");
    }

    public int terminationStatus() {
        throw new RuntimeException("not implemented");
    }
}
