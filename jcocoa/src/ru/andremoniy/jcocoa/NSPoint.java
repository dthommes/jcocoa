package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 17.06.12
 * Time: 23:25
 */
public class NSPoint {

    public Double x;
    public Double y;

    public NSPoint() {
    }

    public NSPoint(Number x, Number y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }
}
