package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSDate;
import static ns.NSDate.*;
import ns.INSDate;
import static ns.INSDate.*;
import ns.NSTimeZone;
import static ns.NSTimeZone.*;
import ns.INSTimeZone;
import static ns.INSTimeZone.*;
import ns.NSLocale;
import static ns.NSLocale.*;
import ns.INSLocale;
import static ns.INSLocale.*;

import ns.NSObject;

public abstract class INSTimeZone extends NSObject {
	public String name() { return null;
};
	public NSData data() { return null;
};
	public Integer secondsFromGMTForDate(NSDate aDate) { return null;
};
	public String abbreviationForDate(NSDate aDate) { return null;
};
	public Boolean isDaylightSavingTimeForDate(NSDate aDate) { return null;
};
	public NSTimeInterval daylightSavingTimeOffsetForDate(NSDate aDate) { return null;
};
	public NSDate nextDaylightSavingTimeTransitionAfterDate(NSDate aDate) { return null;
};
	public Integer secondsFromGMT() { return null;
};
	public String abbreviation() { return null;
};
	public Boolean isDaylightSavingTime() { return null;
};
	public NSTimeInterval daylightSavingTimeOffset() { return null;
};
	public NSDate nextDaylightSavingTimeTransition() { return null;
};
	public String description() { return null;
};
	public Boolean isEqualToTimeZone(NSTimeZone aTimeZone) { return null;
};
	public String localizedName(NSTimeZoneNameStyle style, NSLocale locale) { return null;
};
	public NSObject initWithName(String tzName) { return null;
};
	public NSObject initWithName(String tzName, NSData aData) { return null;
};
}
