package com.cts.MockitoEx3;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class ExternalApiTest {

	@Test
	public void test() {
		
		ExternalApi mock=Mockito.mock(ExternalApi.class);
		
		when(mock.getData(10)).thenReturn(true);
		
		Service service=new Service(mock);
		
		boolean result=service.getData(10);
		assertTrue(result);
		
		verify(mock).getData(eq(10));
		
	}


}
