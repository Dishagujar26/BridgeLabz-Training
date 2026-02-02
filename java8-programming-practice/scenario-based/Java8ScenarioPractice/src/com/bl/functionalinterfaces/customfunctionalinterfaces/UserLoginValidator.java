package com.bl.functionalinterfaces.customfunctionalinterfaces;

@FunctionalInterface
public interface UserLoginValidator {
	boolean validate(String username, String password);
}