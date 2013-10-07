package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSByteOrder {
public static Integer NS_UnknownByteOrder = CFByteOrderUnknown;
public static Integer NS_LittleEndian = CFByteOrderLittleEndian;
public static Integer NS_BigEndian = CFByteOrderBigEndian;

	public static class NSSwappedFloat {
		Integer v;
	}

	public static class NSSwappedDouble {
		Long v;
	}
}
