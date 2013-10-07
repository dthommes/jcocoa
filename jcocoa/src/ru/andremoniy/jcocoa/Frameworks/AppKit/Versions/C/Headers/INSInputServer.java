package ru.andremoniy.jcocoa.Frameworks.AppKit.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;
import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange.*;

public abstract class INSInputServer extends NSObject {

	protected String _name;
	protected NSObject _delegate;

	public NSObject initWithDelegate(NSObject aDelegate, String name) { return null;
};
	public abstract class NSInputServiceProvider {
	public void insertText(NSObject aString, NSObject sender) { return ;
};
	public void doCommandBySelector(SEL aSelector, NSObject sender) { return ;
};
	public void markedTextAbandoned(NSObject sender) { return ;
};
	public void markedTextSelectionChanged(NSRange newSel, NSObject sender) { return ;
};
	public void terminate(NSObject sender) { return ;
};
	public Boolean canBeDisabled() { return null;
};
	public Boolean wantsToInterpretAllKeystrokes() { return null;
};
	public Boolean wantsToHandleMouseEvents() { return null;
};
	public Boolean wantsToDelayTextChangeNotifications() { return null;
};
	public void inputClientBecomeActive(NSObject sender) { return ;
};
	public void inputClientResignActive(NSObject sender) { return ;
};
	public void inputClientEnabled(NSObject sender) { return ;
};
	public void inputClientDisabled(NSObject sender) { return ;
};
	public void activeConversationWillChange(NSObject sender, Integer oldConversation) { return ;
};
	public void activeConversationChanged(NSObject sender, Integer newConversation) { return ;
};
	
}
	public abstract class NSInputServerMouseTracker {
	public Boolean mouseDownOnCharacterIndex(Integer theIndex, NSPoint thePoint, Integer theFlags, NSObject sender) { return null;
};
	public Boolean mouseDraggedOnCharacterIndex(Integer theIndex, NSPoint thePoint, Integer theFlags, NSObject sender) { return null;
};
	public void mouseUpOnCharacterIndex(Integer theIndex, NSPoint thePoint, Integer theFlags, NSObject sender) { return ;
};
	
}
}
