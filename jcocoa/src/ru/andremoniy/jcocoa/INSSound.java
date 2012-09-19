package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSURL;
import static ns.NSURL.*;
import ns.INSURL;
import static ns.INSURL.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSPasteboard;
import static ns.NSPasteboard.*;
import ns.INSPasteboard;
import static ns.INSPasteboard.*;

import ns.NSObject;

public abstract class INSSound extends NSObject {

	protected NSObject _delegate;
	protected NSObject _info;
	protected NSObject _reserved;
	protected Integer _sFlags;

	public NSObject initWithContentsOfURL(NSURL url, Boolean byRef) { return null;
};
	public NSObject initWithContentsOfFile(String path, Boolean byRef) { return null;
};
	public NSObject initWithData(NSData data) { return null;
};
	public Boolean setName(String string) { return null;
};
	public String name() { return null;
};
	public NSObject initWithPasteboard(NSPasteboard pasteboard) { return null;
};
	public void writeToPasteboard(NSPasteboard pasteboard) { return ;
};
	public Boolean play() { return null;
};
	public Boolean pause() { return null;
};
	public Boolean resume() { return null;
};
	public Boolean stop() { return null;
};
	public Boolean isPlaying() { return null;
};
	public NSObject delegate() { return null;
};
	public void setDelegate(NSObject aDelegate) { return ;
};
	public String pathForSoundResource(String name) { return null;
};
}
