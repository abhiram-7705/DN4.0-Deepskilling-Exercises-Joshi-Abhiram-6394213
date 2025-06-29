package com.cts.MockitoEx7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class VoidExampleTest {

	@Test
	public void test() throws Exception {
		
		VoidExample mock=Mockito.mock(VoidExample.class);
		
		
		doThrow(new Exception("exception")).when(mock).getData();
		Exception thrown = assertThrows(Exception.class, mock::getData);
		assertEquals("exception", thrown.getMessage());
		verify(mock).getData();
		
	}

}
