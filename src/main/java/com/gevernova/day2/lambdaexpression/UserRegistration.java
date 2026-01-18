package com.gevernova.day2.lambdaexpression;
import java.util.regex.Pattern;


public class UserRegistration {

    // UC1: First Name
    public Validator firstNameValidator = name -> {
        if (name.length() < 3) return false;
        if (!Character.isUpperCase(name.charAt(0))) return false; // first capital

        for (char c : name.toCharArray())                    // only letters
            if (!Character.isLetter(c)) return false;

        return true;
    };



    /*Validator firstNameValidator = name ->
            Pattern.matches("^[A-Z][a-zA-Z]{2,}$", name);*/

    // UC2: Last Name
    public Validator lastNameValidator = name -> {
        if (name.length() < 3) return false;
        if (!Character.isUpperCase(name.charAt(0))) return false;

        for (char c : name.toCharArray())
            if (!Character.isLetter(c)) return false;

        return true;
    };

    // UC3: Email
    public Validator emailValidator = email -> {
        if (!email.contains("@")) return false;

        int atPos = email.indexOf("@");
        int dotPos = email.lastIndexOf(".");

        // dot must come after @ and not at the end
        return atPos > 0 && dotPos > atPos + 1 && dotPos < email.length() - 1;
    };

    // UC4: Mobile Number
    public Validator mobileValidator = mobile -> {
        String[] parts = mobile.split(" ");                  // split by space

        if (parts.length != 2) return false;                 // country + number
        if (parts[0].length() != 2) return false;            // country code
        if (parts[1].length() != 10) return false;           // 10 digit number

        // check digits only
        for (char c : (parts[0] + parts[1]).toCharArray())
            if (!Character.isDigit(c)) return false;

        return true;
    };

    // UC5–UC8: Password
    public Validator passwordValidator = password -> {
        if (password.length() < 8) return false;             // min length

        int upper = 0, digit = 0, special = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;           // uppercase count
            else if (Character.isDigit(c)) digit++;          // digit count
            else if (!Character.isLetterOrDigit(c)) special++; // special char
        }

        return upper >= 1 && digit >= 1 && special == 1;
    };
}

