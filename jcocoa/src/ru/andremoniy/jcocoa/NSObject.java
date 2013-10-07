package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSZone;

import java.lang.reflect.Method;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:15
 */
public class NSObject {

    public Boolean isMemberOfClass(Class _class) {
        return _class.getName().equals(this.getClass().getName());
    }

    public Boolean respondsToSelector(SEL sel) {
        for (Method method : this.getClass().getMethods())
            if (method.getName().equals(sel.getMethodName())) return true;

        return false;
    }

    public Boolean instancesRespondToSelector(SEL sel) {
        return respondsToSelector(sel);
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

    public Object allocWithZone(INSZone.NSZone zone) {
        throw new RuntimeException("not implemented");
    }

    public <T> T retain() {
        throw new RuntimeException("not implemented");
    }

    public static Class classForConversionRequestFor(Class clazz) {
        throw new RuntimeException("not implemented");
    }

    public Object mutableCopy() {
        throw new RuntimeException("not implemented");
    }
}
