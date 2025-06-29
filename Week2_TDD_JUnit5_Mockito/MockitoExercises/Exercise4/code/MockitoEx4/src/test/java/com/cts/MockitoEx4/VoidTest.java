package com.cts.MockitoEx4;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class VoidTest {

	@Test
	public void test() {
		VoidSample sample=Mockito.mock(VoidSample.class);
		
		doNothing().when(sample).getData();
		
		sample.getData();
		
		verify(sample).getData();
		
	}

}
