package ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers;

import ru.andremoniy.jcocoa.*;

public abstract class INSException extends RuntimeException {
    public static String NSGenericException;
    public static String NSRangeException;
    public static String NSInvalidArgumentException;
    public static String NSInternalInconsistencyException;
    public static String NSMallocException;
    public static String NSObjectInaccessibleException;
    public static String NSObjectNotAvailableException;
    public static String NSDestinationInvalidException;
    public static String NSPortTimeoutException;
    public static String NSInvalidSendPortException;
    public static String NSInvalidReceivePortException;
    public static String NSPortSendException;
    public static String NSPortReceiveException;
    public static String NSOldStyleException;

    public static String NSAssertionHandlerKey;

    protected INSException() {
    }

    public INSException(String msg) {
        super(msg);
    }

    public abstract static class INSAssertionHandler extends NSObject {

        public void handleFailureInMethod(SEL selector, NSObject object, String fileName, Integer line, String format) {
            return;
        }

        ;

        public void handleFailureInFunction(String functionName, String fileName, Integer line, String format) {
            return;
        }

        ;

    }
}
