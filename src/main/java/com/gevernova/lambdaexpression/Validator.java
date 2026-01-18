package com.gevernova.lambdaexpression;

@FunctionalInterface
public interface Validator {
    boolean validate(String input);
}

