package com.email;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String EMAIL_ADDRESS_PATTERN ="^[A-Za-z]+[.+-]?([a-z A-z 0-9]+)?[@][a-zA-z0-9]{1,6}[.][a-zA-Z]{2,6}([.][a-zA-z+,]{2,6})?$" ;

    public boolean validateEmailAddress(String email2Test) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return  pattern.matcher(email2Test).matches();
    }
}