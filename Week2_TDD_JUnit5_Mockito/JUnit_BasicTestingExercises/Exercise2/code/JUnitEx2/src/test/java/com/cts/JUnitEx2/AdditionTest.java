package com.cts.JUnitEx2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void addTest() {
		AdditionExample addition=new AdditionExample();
		
		int result1=addition.add(10,15);
		int result2=addition.add(20, 30);		
		assertEquals(result1, 25);
		assertEquals(result2, 50);
	}

}
