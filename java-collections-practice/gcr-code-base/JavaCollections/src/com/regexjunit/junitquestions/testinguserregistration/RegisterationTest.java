package com.regexjunit.junitquestions.testinguserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RegisterationTest {
	UserRegistration user = new UserRegistration();
	@Test
	void register() {
		assertTrue(user.registerUser("ravi", "ravi@gamil.com", "dfd"));
	}
}
