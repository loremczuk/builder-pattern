package pl.oremczuk.builderpattern;

import java.util.regex.Pattern;

public class OwnValidators {

    public static void validateEmailAddress(String email) {
        boolean match = Pattern.matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}", email);
        if (!match) throw new IllegalArgumentException("Incorrect email address");
    }

    public static void validatePhoneNumber (String phoneNumber) {

        boolean matches = Pattern.matches("(\\+\\d{1,3}[- ]?)?(\\d{3,4} ?){3}", phoneNumber);
        if (!matches) throw new IllegalArgumentException("Incorrect phone number");

    }


}
