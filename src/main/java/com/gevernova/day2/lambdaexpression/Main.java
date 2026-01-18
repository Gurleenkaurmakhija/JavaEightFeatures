package com.gevernova.day2.lambdaexpression;

public class Main {
    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        System.out.println("First Name Valid : " +
                user.firstNameValidator.validate("Gurleen"));

        System.out.println("Last Name Valid  : " +
                user.lastNameValidator.validate("Kaur"));

        System.out.println("Email Valid      : " +
                user.emailValidator.validate("abc.xyz@bl.co.in"));

        System.out.println("Mobile Valid     : " +
                user.mobileValidator.validate("91 9919819801"));

        System.out.println("Password Valid   : " +
                user.passwordValidator.validate("Abc@1234"));
    }
}
