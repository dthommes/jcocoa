package ru.andremoniy.jcocoa;

/**
 * User: 1
 * Date: 17.08.12
 * Time: 10:17
 */
public class NSException extends RuntimeException {

    public static int NSDestinationInvalidException = 0;
    public static int NSInternalInconsistencyException = 1;

    public static void raise(int exceptionType, String ...msg) {
        throw new RuntimeException("not implemented");
    }

    public static void raise(int exceptionType, String msg, Object description) {
        throw new RuntimeException("not implemented");
    }
}
