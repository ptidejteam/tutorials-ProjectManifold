package net.ptidej.tutorial.overriding;

import org.junit.jupiter.api.Assertions;

class Tests {

	@org.junit.jupiter.api.Test
	void test1() {
		try {
			final SuperClass superClass = new SuperClass();
			Assertions.assertNotNull(superClass);
		} catch (final Exception e) {
			Assertions.assertTrue(false, "No exception should be thrown");
		}
	}

	@org.junit.jupiter.api.Test
	void test2() {
		try {
			final SubClass subClass = new SubClass();
			Assertions.assertNotNull(subClass);
		} catch (final Exception e) {
			System.out.println(
					"\nWARNING: All the tests should pass, but net.ptidej.tutorial.overriding.Tests.test2() actually shows the erroneous behaviour!\n");
			Assertions.assertTrue(true, "Expected no exception, caught a NullPointerException");
		}
	}

}
