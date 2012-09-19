package ru.andremoniy.jcocoa;

import java.util.ArrayList;

/**
 * User: Andremoniy
 * Date: 17.06.12
 * Time: 23:57
 */
public class NSMutableArray extends NSArray {

    private ArrayList list = new ArrayList();

    public NSMutableArray(ArrayList list) {
        this.list = list;
    }

    public Object lastObject() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public void addObject(Object obj) {
        list.add(obj);
    }

    public Integer count() {
        return list.size();
    }

    public void removeObjectAtIndex(int i) {
        list.remove(i);
    }

    public static NSMutableArray array() {
        throw new RuntimeException("not implemented");
    }

    public Object objectAtIndex(int index) {
        throw new RuntimeException("not implemented");
    }

    public NSEnumerator objectEnumerator() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void removeAllObjects() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public Integer indexOfObjectIdenticalTo(Object object) {
        throw new RuntimeException("not implemented");
    }

    public Object[] replaceObjectAtIndex(int index, Object obj) {
        throw new RuntimeException("not implemented");
    }

    public Object insertObject(Object obj, int index) {
        throw new RuntimeException("not implemented");
    }

    public void removeObjectsAtIndexes(NSMutableIndexSet indexesToRemove) {
        throw new RuntimeException("not implemented");
    }

    public void removeObject(Object obj) {
        throw new RuntimeException("not implemented");
    }

    public NSArray autorelease() {
        return this;
    }

    public static NSMutableArray arrayWithCapacity(int capacity) {
        throw new RuntimeException("not implemented");
    }

    public void addObjectsFromArray(NSArray array) {
        throw new RuntimeException("not implemented");
    }

    public static NSArray arrayWithArray(NSArray nsArray) {
        throw new RuntimeException("not implemented");
    }

    public static NSMutableArray arrayWithObject(NSObject event) {
        throw new RuntimeException("not implemented");
    }

}
