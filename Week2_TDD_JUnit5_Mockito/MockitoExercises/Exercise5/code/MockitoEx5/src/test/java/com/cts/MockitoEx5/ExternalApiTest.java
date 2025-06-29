package com.cts.MockitoEx5;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class ExternalApiTest {

	@Test
	public void test() {
		
		ExternalApi mock=Mockito.mock(ExternalApi.class);
		
		when(mock.getData()).thenReturn(1)
							.thenReturn(2)
							.thenReturn(3);
		assertEquals(mock.getData(), 1);
		assertEquals(mock.getData(), 2);
		assertEquals(mock.getData(), 3);
	}

}
