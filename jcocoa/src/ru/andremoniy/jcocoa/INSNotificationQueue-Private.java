package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;

public abstract class INSNotificationQueue {
	public void asapProcessMode(String mode) { return ;
};
	public Boolean hasIdleNotificationsInMode(String mode) { return null;
};
	public void idleProcessMode(String mode) { return ;
};
}
