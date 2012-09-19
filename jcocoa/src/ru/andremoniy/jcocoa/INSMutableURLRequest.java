package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSURL;
import static ns.NSURL.*;
import ns.INSURL;
import static ns.INSURL.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSInputStream;
import static ns.NSInputStream.*;
import ns.INSInputStream;
import static ns.INSInputStream.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;

import ns.NSURLRequest;

public abstract class INSMutableURLRequest extends NSURLRequest {
	public void setURL(NSURL value) { return ;
};
	public void setCachePolicy(NSURLRequestCachePolicy value) { return ;
};
	public void setTimeoutInterval(NSTimeInterval value) { return ;
};
	public void setHTTPMethod(String value) { return ;
};
	public void setHTTPBody(NSData value) { return ;
};
	public void setHTTPBodyStream(NSInputStream value) { return ;
};
	public void setAllHTTPHeaderFields(NSDictionary allValues) { return ;
};
	public void setValue(String value, String field) { return ;
};
	public void addValue(String value, String field) { return ;
};
	public void setHTTPShouldHandleCookies(Boolean value) { return ;
};
	public void setMainDocumentURL(NSURL value) { return ;
};
}
