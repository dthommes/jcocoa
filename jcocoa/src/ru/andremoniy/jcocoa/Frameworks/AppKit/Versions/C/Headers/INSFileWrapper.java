package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSFileWrapper {
	public NSObject initWithPath(String path) { return null;
};
	public NSObject initSymbolicLinkWithDestination(String path) { return null;
};
	public Boolean needsToBeUpdatedFromPath(String path) { return null;
};
	public Boolean updateFromPath(String path) { return null;
};
	public Boolean writeToFile(String path, Boolean atomicFlag, Boolean updateFilenamesFlag) { return null;
};
	public String addFileWithPath(String path) { return null;
};
	public String addSymbolicLinkWithDestination(String path, String filename) { return null;
};
	public String symbolicLinkDestination() { return null;
};

	public static class NSFileWrapperReadingOptions extends NSUInteger { }
	public static class NSFileWrapperWritingOptions extends NSUInteger { }}
