package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSException;
import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.NSString;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:17
 */
public class NSException extends INSException {

    protected String name;
    protected String reason;
    protected Object userInfo;

    public NSException() {
    }

    public NSException(String msg) {
        super(msg);
        this.reason = msg;
    }

    public NSException(String name, String msg, Object userInfo) {
        super(msg);
        this.name = name;
        this.userInfo = userInfo;
        this.reason = msg;
    }

    public static void raise(String exceptionType, String... msg) {
        throw new NSException(exceptionType + " : " + msg);
    }

    public static void raise(String exceptionType, String msg, Object description) {
        throw new NSException(exceptionType + " : " + msg + "\n" + description);
    }

    public static NSException exceptionWithNamereasonuserInfo(String name, String reason, Object userInfo, Class _invocator)  {
        if (_invocator != null) {
            try {
                NSException exceptionObject = (NSException) _invocator.newInstance();
                exceptionObject.name = name;
                exceptionObject.reason = reason;
                exceptionObject.userInfo = userInfo;
                return exceptionObject;
            } catch (Exception e) {

            }
        }
        return new NSException(name, reason, userInfo);
    }

    public NSString reason() {
        return new NSString(reason != null ? reason : getMessage());
    }

    public NSString name() {
        return new NSString(name);
    }

}
