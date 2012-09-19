package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSFileHandle_win32;
import static ns.NSFileHandle_win32.*;
import ns.INSFileHandle_win32;
import static ns.INSFileHandle_win32.*;

import ns.NSPipe;

public abstract class INSPipe_win32 extends NSPipe {

	protected NSFileHandle_win32 _fileHandleForReading;
	protected NSFileHandle_win32 _fileHandleForWriting;

}
