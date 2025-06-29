package com.cts.MockitoEx6;

import static org.mockito.Mockito.inOrder;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class OrderExampleTest {

	@Test
	public void test() {
		OrderExample mock=Mockito.mock(OrderExample.class);
		
		mock.function1();
		mock.function2();
		mock.function3();
		
		InOrder order=inOrder(mock);
		order.verify(mock).function1();
		order.verify(mock).function2();
		order.verify(mock).function3();
	}

}
