package ru.andremoniy.cocoa;

import java.awt.*;

/**
 * User: Andremoniy
 * Date: 17.06.12
 * Time: 22:53
 */
public class NSColor {

    public static final Color brown = new Color(0.6f, 0.4f, 0.2f, 1.0f);
    public static final Color clear = new Color(0, 0, 0, 0);
    public static final Color ourple = new Color(0.5f, 0, 0.5f, 1);

    private Color color;

    private NSColor(Color color) {
        this.color = color;
    }

    public static NSColor blackColor() {
        return new NSColor(Color.black);
    }

    public static NSColor blueColor() {
        return new NSColor(Color.blue);
    }

    public static NSColor brownColor() {
        return new NSColor(brown);
    }

    public static NSColor clearColor() {
        return new NSColor(clear);
    }

    public static NSColor cyanColor() {
        return new NSColor(Color.cyan);
    }

    public static NSColor darkGrayColor() {
        return new NSColor(Color.darkGray);
    }

    public static NSColor grayColor() {
        return new NSColor(Color.gray);
    }

    public static NSColor greenColor() {
        return new NSColor(Color.green);
    }

    public static NSColor lightGrayColor() {
        return new NSColor(Color.lightGray);
    }

    public static NSColor magentaColor() {
        return new NSColor(Color.magenta);
    }

    public static NSColor orangeColor() {
        return new NSColor(Color.orange);
    }

    public static NSColor purpleColor() {
        return new NSColor(ourple);
    }

    public static NSColor redColor() {
        return new NSColor(Color.red);
    }

    public static NSColor whiteColor() {
        return new NSColor(Color.white);
    }

    public static NSColor yellowColor() {
        return new NSColor(Color.yellow);
    }

    public NSColor colorWithAlphaComponent(double ac) {
        return new NSColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), (float) ac));
    }

    public static NSColor colorWithCalibratedRed(double r, double g, double b, double a) {
        return new NSColor(new Color((float) r, (float) g, (float) b, (float) a));
    }

    public void setStroke() {
        // TODO: установить цвет обводки текущего графическаго интерфейса
    }

    public void set() {
        throw new RuntimeException("not implemented");
    }

    public Double alphaComponent() {
        throw new RuntimeException("not implemented");
    }

    public static NSColor selectedTextBackgroundColor() {
        throw new RuntimeException("not implemented");
    }

    public String hexString() {
        throw new RuntimeException("not implemented");
    }

    public static NSColor rgbGrey(double r, double g) {
        throw new RuntimeException("not implemented");
    }

    public static NSColor veryLightGrey() {
        throw new RuntimeException("not implemented");
    }

    public static NSColor colorWithDeviceRed(double v, double v1, double v2, double v3) {
        throw new RuntimeException("not implemented");
    }
}
