package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSData {
	public void getBytes(void buffer) { return ;
};
public static Integer NSDataReadingMapped = 1UL;
public static Integer NSDataReadingUncached = 1UL;

	public static class NSDataReadingOptions extends NSUInteger { }public static Integer NSDataWritingAtomic = 1UL;

	public static class NSDataWritingOptions extends NSUInteger { }public static Integer NSMappedRead = NSDataReadingMapped;
public static Integer NSUncachedRead = NSDataReadingUncached;
public static Integer NSAtomicWrite = NSDataWritingAtomic;

	public static class NSDataSearchOptions extends NSUInteger { }public abstract static class INSMutableData extends NSData {
	public void mutableBytes() { return ;
};
	public void setLength(Integer length) { return ;
};

}
public abstract static class INSMutableData {
	public void appendBytes(void bytes, Integer length) { return ;
};
	public void appendData(NSData other) { return ;
};
	public void increaseLengthBy(Integer extraLength) { return ;
};
	public void replaceBytesInRange(NSRange range, void bytes) { return ;
};
	public void resetBytesInRange(NSRange range) { return ;
};
	public void setData(NSData data) { return ;
};

}
public abstract static class INSMutableData {
	public NSObject initWithCapacity(Integer capacity) { return null;
};
	public NSObject initWithLength(Integer length) { return null;
};

}
}
