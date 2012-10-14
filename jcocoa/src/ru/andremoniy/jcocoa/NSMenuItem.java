package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:15
 */
public class NSMenuItem {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void action() {
        throw new RuntimeException("not implemented");
    }

    public static NSMenuItem separatorItem() {
        throw new RuntimeException("not implemented");
    }
}
