package com.arvind.abc.junit1;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.arvind.abc.junit1.*;

public class TestConsecutiveString {
	
	ConsecutiveString obj = new ConsecutiveString();
	
	@Test
	public void testConsecutiveString()
	{
		ConsecutiveString obj = new ConsecutiveString();
		
		ArrayList<String> actualConsecutiveLetter = new ArrayList<String>();
		ArrayList<String> expectedConsecutiveLetter = new ArrayList<String>();
		
		actualConsecutiveLetter.add("Hello");
		actualConsecutiveLetter.add("Apple");
		actualConsecutiveLetter.add("Qainfotech");
		actualConsecutiveLetter.add("Accv");
		
		expectedConsecutiveLetter.add("Hello");
		expectedConsecutiveLetter.add("Apple");
		expectedConsecutiveLetter.add("Accv");
		
		ArrayList<String> actualConsecutiveLetterResult = obj.getConsecutiveString(actualConsecutiveLetter);
		System.out.println("dfjfn");
		assertEquals(expectedConsecutiveLetter, actualConsecutiveLetterResult);
		
		
	}
}
