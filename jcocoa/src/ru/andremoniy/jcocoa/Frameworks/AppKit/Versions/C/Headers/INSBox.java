package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSBox {
	public void setTitleWithMnemonic(String stringWithAmpersand) { return ;
};
public static Integer NSNoTitle = 0;
public static Integer NSAboveTop = 1;
public static Integer NSAtTop = 2;
public static Integer NSBelowTop = 3;
public static Integer NSAboveBottom = 4;
public static Integer NSAtBottom = 5;
public static Integer NSBelowBottom = 6;

	public static class NSTitlePosition extends NSUInteger { }public static Integer NSBoxPrimary = 0;
public static Integer NSBoxSecondary = 1;
public static Integer NSBoxSeparator = 2;
public static Integer NSBoxOldStyle = 3;

	public static class NSBoxType extends NSUInteger { }}
