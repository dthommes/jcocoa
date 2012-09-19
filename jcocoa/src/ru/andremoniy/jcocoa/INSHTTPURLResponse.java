package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSURLResponse;

public abstract class INSHTTPURLResponse extends NSURLResponse {

	protected Integer _statusCode;
	protected NSDictionary _allHeaderFields;

	public NSDictionary allHeaderFields() { return null;
};
	public Integer statusCode() { return null;
};
}
