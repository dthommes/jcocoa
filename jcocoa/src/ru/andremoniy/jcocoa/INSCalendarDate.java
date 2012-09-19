package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*

public abstract class INSCalendarDate extends NSDate {

	protected Integer refCount;
	protected NSTimeInterval _timeIntervalSinceReferenceDate;
	protected NSTimeZone _timeZone;
	protected String _formatString;
	protected void _reserved;

	public NSCalendarDate dateByAddingYears(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second) { return null;
};
	public Integer dayOfCommonEra() { return null;
};
	public Integer dayOfMonth() { return null;
};
	public Integer dayOfWeek() { return null;
};
	public Integer dayOfYear() { return null;
};
	public Integer hourOfDay() { return null;
};
	public Integer minuteOfHour() { return null;
};
	public Integer monthOfYear() { return null;
};
	public Integer secondOfMinute() { return null;
};
	public Integer yearOfCommonEra() { return null;
};
	public String calendarFormat() { return null;
};
	public String descriptionWithCalendarFormat(String format, NSObject locale) { return null;
};
	public String descriptionWithCalendarFormat(String format) { return null;
};
	public String descriptionWithLocale(NSObject locale) { return null;
};
	public NSTimeZone timeZone() { return null;
};
	public NSObject initWithString(String description, String format, NSObject locale) { return null;
};
	public NSObject initWithString(String description, String format) { return null;
};
	public NSObject initWithString(String description) { return null;
};
	public NSObject initWithYear(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second, NSTimeZone aTimeZone) { return null;
};
	public void setCalendarFormat(String format) { return ;
};
	public void setTimeZone(NSTimeZone aTimeZone) { return ;
};
	public void years(Integer yp, Integer mop, Integer dp, Integer hp, Integer mip, Integer sp, NSCalendarDate date) { return ;
};
	public NSCalendarDate dateWithCalendarFormat(String format, NSTimeZone aTimeZone) { return null;
};
	public String descriptionWithCalendarFormat(String format, NSTimeZone aTimeZone, NSObject locale) { return null;
};
	public NSObject initWithString(String description) { return null;
};
}
