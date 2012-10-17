package ru.andremoniy.jcocoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:12
  */
public class NSMutableDictionary extends NSDictionary {

    Map<String, Object> dictionary = new HashMap<String, Object>();

    public static NSMutableDictionary dictionary() {
        return new NSMutableDictionary();
    }

    public Object objectForKey(String key) {
        return dictionary.get(key);
    }

    public void setObject(Object object, String key) {
        dictionary.put(key, object);
    }

    public NSMutableDictionary init() {
        return this;
    }

    public int count() {
        return dictionary.keySet().size();
    }

    public void removeObjectForKey(String key) {
        dictionary.remove(key);
    }

    public NSArray allKeys() {
        return new NSMutableArray(new ArrayList(dictionary.keySet()));
    }

    public NSArray allKeysForObject(Object obj) {
        throw new RuntimeException("not implemented");
    }

    public NSArray allValues() {
        return new NSMutableArray(new ArrayList(dictionary.values()));
    }

    public void removeAllObjects() {
        dictionary.clear();
    }

    public void setDictionary(NSDictionary info) {
        throw new RuntimeException("not implemented");
    }

    public void addEntriesFromDictionary(NSDictionary dictionary) {
        throw new RuntimeException("not implemented");
    }

    public NSDictionary deepCopy() {
        throw new RuntimeException("not implemented");
    }

    public static NSMutableDictionary dictionaryWithDictionary(NSDictionary di) {
        throw new RuntimeException("not implemented");
    }
}
