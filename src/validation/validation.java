package validation;

import java.util.Arrays;

public class validation {

    public static boolean validateUserAnswer(String inputMethod) {
        return (Arrays.asList("1", "2", "3", "4").contains(inputMethod));
    }

    public static boolean validateType(String type) {
        return (Arrays.asList("1", "2", "3").contains(type));
    }
    public static boolean validateMethod(String inputMethod) {
        return (Arrays.asList("1", "2", "3").contains(inputMethod));
    }
}
