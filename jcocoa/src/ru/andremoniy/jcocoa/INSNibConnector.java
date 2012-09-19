package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;

import ns.NSObject;

public abstract class INSNibConnector extends NSObject {

	protected NSObject _source;
	protected NSObject _destination;
	protected String _label;

	public NSObject source() { return null;
};
	public void setSource(NSObject source) { return ;
};
	public NSObject destination() { return null;
};
	public void setDestination(NSObject destination) { return ;
};
	public String label() { return null;
};
	public void setLabel(String label) { return ;
};
	public void replaceObject(NSObject oldObject, NSObject newObject) { return ;
};
	public void establishConnection() { return ;
};
}
