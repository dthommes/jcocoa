package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSPathUtilities {
	public static Void NSUserName;
	public static Void NSFullUserName;
	public static Void NSHomeDirectory;
	public static String NSHomeDirectoryForUser;
	public static Void NSTemporaryDirectory;
	public static Void NSOpenStepRootDirectory;
public static Integer NSApplicationDirectory = 1;
public static Integer NSDemoApplicationDirectory = null;
public static Integer NSDeveloperApplicationDirectory = null;
public static Integer NSAdminApplicationDirectory = null;
public static Integer NSLibraryDirectory = null;
public static Integer NSDeveloperDirectory = null;
public static Integer NSUserDirectory = null;
public static Integer NSDocumentationDirectory = null;
public static Integer NSAllApplicationsDirectory = 100;
public static Integer NSAllLibrariesDirectory = 101;

	public static class NSSearchPathDirectory extends NSUInteger { }public static Integer NSUserDomainMask = 1;
public static Integer NSLocalDomainMask = 2;
public static Integer NSNetworkDomainMask = 4;
public static Integer NSSystemDomainMask = 8;
public static Integer NSAllDomainsMask = 0x0ffff;

	public static class NSSearchPathDomainMask extends NSUInteger { }	public static Boolean NSSearchPathForDirectoriesInDomains;
public abstract static class INSString {
	public NSArray pathComponents() { return null;
};
	public Boolean isAbsolutePath() { return null;
};
	public String lastPathComponent() { return null;
};
	public String stringByDeletingLastPathComponent() { return null;
};
	public String stringByAppendingPathComponent(String str) { return null;
};
	public String pathExtension() { return null;
};
	public String stringByDeletingPathExtension() { return null;
};
	public String stringByAppendingPathExtension(String str) { return null;
};
	public String stringByAbbreviatingWithTildeInPath() { return null;
};
	public String stringByExpandingTildeInPath() { return null;
};
	public String stringByStandardizingPath() { return null;
};
	public String stringByResolvingSymlinksInPath() { return null;
};
	public NSArray stringsByAppendingPaths(NSArray paths) { return null;
};
	public Integer completePathIntoString(String outputName, Boolean flag, NSArray outputArray, NSArray filterTypes) { return null;
};
	public char fileSystemRepresentation() { return 0;
};
	public Boolean getFileSystemRepresentation(char cname, Integer max) { return null;
};

}
public abstract static class INSArray {
	public NSArray pathsMatchingExtensions(NSArray filterTypes) { return null;
};

}
}
