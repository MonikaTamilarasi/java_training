package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {
	
	@Test
	@DisplayName(value = "Test the Get Message return a String of Length 8 characters")
	void testMaxLength() {
		
		Greeting grtObj = new Greeting();
		int actual = grtObj.getmessage().length();
		int expected=5;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value = "Test the Birthday wish method does not return null")
	void testBirthDayWish() {
		                                                                              
		Greeting grtObj = new Greeting();
		String actual = grtObj.birthDayWish("ramesh");
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value = "Test Birthday Wish method should return Happy Birthday with user name suffixed")
	void testBrithDaySuffix() {
		
		Greeting grtObj = new Greeting();
		String name="ramesh";
		String actual = grtObj.birthDayWish(name);
		String expected="Happy Birthday "+name;
		assertEquals(expected, actual);

	}

}
