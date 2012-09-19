package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;


public abstract class I_NSBinder extends NSObject {

	protected NSObject _source;
	protected NSObject _destination;
	protected String _keyPath;
	protected String _bindingPath;
	protected String _binding;
	protected NSMutableDictionary _options;

	public NSObject defaultBindingOptionsForBinding(NSObject binding) { return null;
};
	public NSObject options() { return null;
};
	public void setOptions(NSObject value) { return ;
};
	public NSObject source() { return null;
};
	public void setSource(NSObject value) { return ;
};
	public NSObject destination() { return null;
};
	public void setDestination(NSObject value) { return ;
};
	public String keyPath() { return null;
};
	public void setKeyPath(String value) { return ;
};
	public String binding() { return null;
};
	public void setBinding(String value) { return ;
};
	public void bind() { return ;
};
	public void unbind() { return ;
};
	public void setBindingPath(NSObject value) { return ;
};
	public NSObject bindingPath() { return null;
};
	public NSArray peerBinders() { return null;
};
	public void startObservingChanges() { return ;
};
	public void stopObservingChanges() { return ;
};
	public Boolean conditionallySetsEditable() { return null;
};
	public Boolean conditionallySetsEnabled() { return null;
};
	public Boolean allowsEditingMultipleValues() { return null;
};
	public Boolean createsSortDescriptor() { return null;
};
	public Boolean raisesForNotApplicableKeys() { return null;
};
	public Boolean continuouslyUpdatesValue() { return null;
};
	public NSObject multipleValuesPlaceholder() { return null;
};
	public NSObject noSelectionPlaceholder() { return null;
};
	public NSObject nullPlaceholder() { return null;
};
	public NSObject transformedObject(NSObject object) { return null;
};
	public NSObject reverseTransformedObject(NSObject object) { return null;
};
}
