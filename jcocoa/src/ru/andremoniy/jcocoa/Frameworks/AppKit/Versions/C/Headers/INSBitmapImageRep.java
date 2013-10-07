package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSFileManager.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSKeyValueCoding.INSDictionary.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSData;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSData.*;

public abstract class INSBitmapImageRep {
	public NSData representationUsingType(NSBitmapImageFileType storageType, NSDictionary properties) { return null;
};
	public void setProperty(String property, NSObject value) { return ;
};
	public NSObject valueForProperty(String property) { return null;
};
public static Integer NSTIFFCompressionNone = 1;
public static Integer NSTIFFCompressionCCITTFAX3 = 3;
public static Integer NSTIFFCompressionCCITTFAX4 = 4;
public static Integer NSTIFFCompressionLZW = 5;
public static Integer NSTIFFCompressionJPEG = 6;
public static Integer NSTIFFCompressionNEXT = 32766;
public static Integer NSTIFFCompressionPackBits = 32773;
public static Integer NSTIFFCompressionOldJPEG = 32865;

	public static class NSTIFFCompression extends NSUInteger { }public static Integer NSTIFFFileType = null;
public static Integer NSBMPFileType = null;
public static Integer NSGIFFileType = null;
public static Integer NSJPEGFileType = null;
public static Integer NSPNGFileType = null;

	public static class NSBitmapImageFileType extends NSUInteger { }	public static String NSImageCompressionMethod;
	public static String NSImageCompressionFactor;
	public static String NSImageDitherTransparency;
	public static String NSImageRGBColorTable;
	public static String NSImageInterlaced;
	public static String NSImageColorSyncProfileData;
	public static String NSImageFrameCount;
	public static String NSImageCurrentFrame;
	public static String NSImageCurrentFrameDuration;
	public static String NSImageLoopCount;
	public static String NSImageGamma;
	public static String NSImageProgressive;
	public static String NSImageEXIFData;
	public static String NSImageFallbackBackgroundColor;
}
