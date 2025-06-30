import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderTest {

	@Test
	@Order(3)
	void test1() {
		System.out.println("1st test run");
		assertTrue(true);
	}
	@Test
	@Order(1)
	void test2() {
		System.out.println("2nd test run");
		assertTrue(true);
	}
	@Test
	@Order(2)
	void test3() {
		System.out.println("3rd test run");
		assertTrue(true);
	}

}
