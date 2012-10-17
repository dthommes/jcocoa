package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:06
 */
public class MathEx {
    public static Number fmodf(Object a1, Double a2) {
        return a1 % a2;
    }

    public static Number fmodf(double a1, double a2) {
        return a1 % a2;
    }

    public static Number fabsf(Number value) {
        return Math.abs(value.doubleValue());
    }

    public static Number fabsf(float value) {
        return Math.abs(value);
    }

    public static Number fabsf(double value) {
        return Math.abs(value);
    }

    public static Number atanf(Number value) {
        return Math.atan(value.doubleValue());
    }

    public static Number atanf(float value) {
        return Math.atan(value);
    }

    public static Number atanf(double value) {
        return (Double) Math.atan(value);
    }

    public static Number AngleBetween2(NSPoint p1, NSPoint p2, NSPoint p3) {
        throw new RuntimeException("not implemented");
    }

    public static Number sinf(float angle) {
        return Math.sin(angle);
    }

    public static Number sinf(Number angle) {
        return Math.sin(angle);
    }

    public static Number cosf(float angle) {
        return Math.cos(angle);
    }

    public static Number cosf(Number angle) {
        return Math.cos(angle);
    }

    public static Double pi = Math.PI;

    public static Number fabs(Object value) {
        return Math.abs(value);
    }

    public static Number hypotf(double v1, double v2) {
        throw new RuntimeException("not implemented");
    }

    public static Number isinf(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static Number isnan(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static Number sqrtf(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static Number hypotf(Object v1, Object v2) {
        throw new RuntimeException("not implemented");
    }

    public static Number atan2f(Number v1, Number v2) {
        throw new RuntimeException("not implemented");
    }

    public static Number roundtol(Object value) {
        return Math.round(((Number)value).doubleValue());
    }

    public static Number ceil(float value) {
        return Math.ceil(value);
    }

    public static Number ceil(double value) {
        return Math.ceil(value);
    }

    public static Number Slope(Object p1, Object p2) {
        throw new RuntimeException("not implemented");
    }
}
