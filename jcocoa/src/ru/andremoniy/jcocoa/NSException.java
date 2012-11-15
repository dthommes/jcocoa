package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSException;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:17
 */
public class NSException extends INSException {

    public static void raise(String exceptionType, String ...msg) {
        throw new RuntimeException("not implemented");
    }

    public static void raise(String exceptionType, String msg, Object description) {
        throw new RuntimeException("not implemented");
    }
}
