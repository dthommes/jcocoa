package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;

import ns.NSImageRep;

public abstract class INSPDFImageRep extends NSImageRep {

	protected NSData _pdfData;
	protected int _reserved1;
	protected int _reserved2;
	protected NSObject _private;

	public NSObject initWithData(NSData pdfData) { return null;
};
	public NSData PDFRepresentation() { return null;
};
	public NSRect bounds() { return null;
};
	public void setCurrentPage(Integer page) { return ;
};
	public Integer currentPage() { return null;
};
	public Integer pageCount() { return null;
};
}
