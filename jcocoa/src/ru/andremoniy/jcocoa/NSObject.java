package ru.andremoniy.jcocoa;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:15
 */
public class NSObject {

    public Boolean respondsToSelector(SEL sel) {
        throw new RuntimeException("not implemented");
    }

    public Boolean respondsToSelector(String selName) {
        throw new RuntimeException("not implemented");
    }

    public void doesNotRecognizeSelector(SEL sel) {
        throw new RuntimeException("not implemented");
    }

    public String description() {
        throw new RuntimeException("not implemented");
    }

    public Object allocWithZone(NSZone zone) {
        throw new RuntimeException("not implemented");
    }

    public NSObject retain() {
        throw new RuntimeException("not implemented");
    }
}
