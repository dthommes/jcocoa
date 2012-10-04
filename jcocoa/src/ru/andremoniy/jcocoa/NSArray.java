package ru.andremoniy.jcocoa;

import java.util.List;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:08
 */
public abstract class NSArray extends NSObject implements List {

    public abstract Object lastObject();

    public abstract void addObject(Object obj);

    public abstract Integer count();

    public abstract void removeObjectAtIndex(int i);

    public abstract Object objectAtIndex(int index);

    public abstract NSEnumerator objectEnumerator();

    public static NSArray arrayWithObject(NSObject event) {
        throw new RuntimeException("not implemented");
    }

    public NSMutableArray mutableCopy() {
        throw new RuntimeException("not implemented");
    }

    public abstract void removeAllObjects();

    public NSArray valueForKey(String key) {
        throw new RuntimeException("not implemented");
    }

    public Integer indexOfObject(Object object) {
        throw new RuntimeException("not implemented");
    }

    public abstract Integer indexOfObjectIdenticalTo(Object object);


    public NSEnumerator reverseObjectEnumerator() {
        throw new RuntimeException("not implemented");
    }

}
