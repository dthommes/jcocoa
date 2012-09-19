package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;
import ns.NSIndexSet;
import static ns.NSIndexSet.*;
import ns.INSIndexSet;
import static ns.INSIndexSet.*;
import ns.NSCoder;
import static ns.NSCoder.*;
import ns.INSCoder;
import static ns.INSCoder.*;

import ns.NSIndexSet;

public abstract class INSMutableIndexSet extends NSIndexSet {

	protected Integer _capacity;

	public void addIndexesInRange(NSRange range) { return ;
};
	public void addIndexes(NSIndexSet other) { return ;
};
	public void addIndex(Integer index) { return ;
};
	public void removeAllIndexes() { return ;
};
	public void removeIndexesInRange(NSRange range) { return ;
};
	public void removeIndexes(NSIndexSet other) { return ;
};
	public void removeIndex(Integer index) { return ;
};
	public void shiftIndexesStartingAtIndex(Integer index, Integer delta) { return ;
};
	public void encodeWithCoder(NSCoder coder) { return ;
};
	public NSObject initWithCoder(NSCoder coder) { return null;
};
}
