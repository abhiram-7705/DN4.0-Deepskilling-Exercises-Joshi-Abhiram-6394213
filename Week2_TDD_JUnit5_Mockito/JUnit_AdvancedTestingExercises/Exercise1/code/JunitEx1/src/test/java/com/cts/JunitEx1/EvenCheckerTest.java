package com.cts.JunitEx1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenCheckerTest {

	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10,12,14})
	void test(int n) {
		EvenChecker obj=new EvenChecker();
		assertTrue(obj.isEven(n));
	}

}
