package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 17.10.12
 * Time: 9:45
 */
public class NSThread extends INSThread {

    @Override
    public NSMutableDictionary threadDictionary() {
        throw new RuntimeException("not implemented");
    }

    public static Object callStackSymbols() {
        throw new RuntimeException("not implemented");
    }
}
