package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:12
 */
public class NSDictionary extends INSDictionary {
    public static NSDictionary dictionaryWithObject(String key, String value) {
        throw new RuntimeException("not implemented");
    }

    public Object objectForKey(String key) {
        throw new RuntimeException("not implemented");
    }

    public NSEnumerator<String> keyEnumerator() {
        throw new RuntimeException("not implemented");
    }

    public NSDictionary deepCopy() {
        throw new RuntimeException("not implemented");
    }

    public static NSDictionary dictionaryWithObjectsAndKeys(Object ...objAndKeys) {
        throw new RuntimeException("not implemented");
    }

    public static NSDictionary dictionaryWithObjects(NSArray items, NSArray keys) {
        throw new RuntimeException("not implemented");
    }
}
