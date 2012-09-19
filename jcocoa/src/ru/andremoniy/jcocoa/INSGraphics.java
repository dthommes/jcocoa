package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

public abstract class INSGraphics {
public static Integer NSCompositeClear = 0;
public static Integer NSCompositeCopy = 1;
public static Integer NSCompositeSourceOver = 2;
public static Integer NSCompositeSourceIn = 3;
public static Integer NSCompositeSourceOut = 4;
public static Integer NSCompositeSourceAtop = 5;
public static Integer NSCompositeDestinationOver = 6;
public static Integer NSCompositeDestinationIn = 7;
public static Integer NSCompositeDestinationOut = 8;
public static Integer NSCompositeDestinationAtop = 9;
public static Integer NSCompositeXOR = 10;
public static Integer NSCompositePlusDarker = 11;
public static Integer NSCompositeHighlight = 12;
public static Integer NSCompositePlusLighter = 13;

	public static class NSCompositingOperation extends NSUInteger { }public static Integer NSBackingStoreRetained = 0;
public static Integer NSBackingStoreNonretained = 1;
public static Integer NSBackingStoreBuffered = 2;

	public static class NSBackingStoreType extends NSUInteger { }public static Integer NSWindowAbove = 1;
public static Integer NSWindowBelow = -1;
public static Integer NSWindowOut = 0;

	public static class NSWindowOrderingMode extends NSInteger { }public static Integer NSFocusRingOnly = 0;
public static Integer NSFocusRingBelow = 1;
public static Integer NSFocusRingAbove = 2;

	public static class NSFocusRingPlacement extends NSUInteger { }}
