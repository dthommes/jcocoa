package ru.andremoniy.jcocoa;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 0:06
 */
public class MathEx {
    public static double fmodf(Float a1, Float a2) {
        return a1 % a2;
    }

    public static double fmodf(double a1, double a2) {
        return a1 % a2;
    }

    public static double fabsf(float value) {
        return Math.abs(value);
    }

    public static double fabsf(double value) {
        return Math.abs(value);
    }

    public static double atanf(float value) {
        return Math.atan(value);
    }

    public static Double atanf(double value) {
        return (Double) Math.atan(value);
    }

    public static float AngleBetween2(NSPoint p1, NSPoint p2, NSPoint p3) {
        throw new RuntimeException("not implemented");
    }

    public static double sinf(float angle) {
        return Math.sin(angle);
    }

    public static double sinf(double angle) {
        return Math.sin(angle);
    }

    public static double cosf(float angle) {
        return Math.cos(angle);
    }

    public static double cosf(double angle) {
        return Math.cos(angle);
    }

    public static double pi = Math.PI;

    public static double fabs(double value) {
        return Math.abs(value);
    }

    public static double hypotf(double v1, double v2) {
        throw new RuntimeException("not implemented");
    }

    public static double isinf(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static double isnan(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static double sqrtf(double v1) {
        throw new RuntimeException("not implemented");
    }

    public static double hypotf(Object v1, Object v2) {
        throw new RuntimeException("not implemented");
    }

    public static double atan2f(double v1, double v2) {
        throw new RuntimeException("not implemented");
    }

    public static double roundtol(float value) {
        return Math.round(value);
    }

    public static double ceil(float value) {
        return Math.ceil(value);
    }

    public static double ceil(double value) {
        return Math.ceil(value);
    }
}
