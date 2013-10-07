package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSScroller {
	public void setFloatValue(Double aFloat, Double proportion) { return ;
};
public static Integer NSScrollerArrowsMaxEnd = 0;
public static Integer NSScrollerArrowsMinEnd = 1;
public static Integer NSScrollerArrowsDefaultSetting = 0;
public static Integer NSScrollerArrowsNone = 2;

	public static class NSScrollArrowPosition extends NSUInteger { }public static Integer NSNoScrollerParts = 0;
public static Integer NSOnlyScrollerArrows = 1;
public static Integer NSAllScrollerParts = 2;

	public static class NSUsableScrollerParts extends NSUInteger { }public static Integer NSScrollerNoPart = 0;
public static Integer NSScrollerDecrementPage = 1;
public static Integer NSScrollerKnob = 2;
public static Integer NSScrollerIncrementPage = 3;
public static Integer NSScrollerDecrementLine = 4;
public static Integer NSScrollerIncrementLine = 5;
public static Integer NSScrollerKnobSlot = 6;

	public static class NSScrollerPart extends NSUInteger { }public static Integer NSScrollerIncrementArrow = 0;
public static Integer NSScrollerDecrementArrow = 1;

	public static class NSScrollerArrow extends NSUInteger { }}
