package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSCollectionView;
import static ns.NSCollectionView.*;
import ns.INSCollectionView;
import static ns.INSCollectionView.*;

import ns.NSViewController;

public abstract class INSCollectionViewItem extends NSViewController {

	protected NSCollectionView _collectionView;
	protected Boolean _isSelected;

	public NSCollectionView collectionView() { return null;
};
	public Boolean isSelected() { return null;
};
	public void setSelected(Boolean value) { return ;
};
}
