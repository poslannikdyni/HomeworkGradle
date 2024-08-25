package org.example;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null)
            throw new IllegalArgumentException("Argument cannot be null");

        if (str.isEmpty())
            throw new IllegalArgumentException("String cannot be empty");

        var maybeInteger = !str.contains(".") && !str.contains(",");

        try {
            if (maybeInteger) {
                var test = Long.parseLong(str);
                return test > 0;
            } else {
                var test = Double.parseDouble(str);
                return test > 0;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Is not a number");
        }
    }
}
