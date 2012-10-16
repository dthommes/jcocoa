package ru.andremoniy.jcocoa;

/**
 * User: 1
 * Date: 25.08.12
 * Time: 20:44
 */
public class NSFileManager {
    public static NSFileManager defaultManager() {
        throw new RuntimeException("not implemented");
    }

    public boolean fileExistsAtPath(String path) {
        throw new RuntimeException("not implemented");
    }

    public boolean fileExistsAtPath(String path, boolean isDir) {
        throw new RuntimeException("not implemented");
    }

    public NSData contentsAtPath(String path) {
        throw new RuntimeException("not implemented");
    }

    public void removeItemAtPath(String path, Object object) {
        throw new RuntimeException("not implemented");
    }

    public void copyItemAtPath(String sourceFilename, String targetFilename, Object o) {
        throw new RuntimeException("not implemented");
    }

    public NSDirectoryEnumerator enumeratorAtPath(String path) {
        throw new RuntimeException("not implemented");
    }

    public NSArray contentsOfDirectoryAtPath(String path, Object o) {
        throw new RuntimeException("not implemented");
    }
}
