package org.derryfield.math;

public class Algebra {

    public static double harmonicMean(double x, double y) {

        // Validate inputs
        if (x <= 0 || y <= 0 || (x + y) == 0) {
            throw new IllegalArgumentException("Values must be positive and sum cannot be zero.");
        }

        return (2 * x * y) / (x + y);
    }
}