package com.regexjunit.junitquestions.testingparameterized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class Main {
	Logic l = new Logic();
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,4,24,2,11,33})
	
	void check(int n) {
		assertTrue(l.isEven(n));
	}
}