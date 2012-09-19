package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;

import ns.NSObject;

public abstract class INSPropertyListReader_binary1 extends NSObject {

	protected NSData _data;
	protected Integer _length;
	protected uint8_t _bytes;
	protected uint8_t _trailerOffsetIntSize;
	protected uint8_t _trailerOffsetRefSize;
	protected uint64_t _trailerNumObjects;
	protected uint64_t _trailerTopObject;
	protected uint64_t _trailerOffsetTableOffset;

	public NSObject initWithData(NSData data) { return null;
};
	public NSObject read() { return null;
};
}
