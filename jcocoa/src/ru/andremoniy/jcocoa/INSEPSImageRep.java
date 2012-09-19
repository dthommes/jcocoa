package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSPDFImageRep;
import static ns.NSPDFImageRep.*;
import ns.INSPDFImageRep;
import static ns.INSPDFImageRep.*;

import ns.NSImageRep;

public abstract class INSEPSImageRep extends NSImageRep {

	protected NSPoint _bBoxOrigin;
	protected NSData _epsData;
	protected NSPDFImageRep _pdfImageRep;

	public NSObject initWithData(NSData epsData) { return null;
};
	public void prepareGState() { return ;
};
	public NSData EPSRepresentation() { return null;
};
	public NSRect boundingBox() { return null;
};
}
