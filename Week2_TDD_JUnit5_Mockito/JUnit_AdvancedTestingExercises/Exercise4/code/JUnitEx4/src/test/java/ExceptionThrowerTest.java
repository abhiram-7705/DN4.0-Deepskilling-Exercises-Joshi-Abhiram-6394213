import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionThrowerTest {

	@Test
	void test() {
		ExceptionThrower exp=new ExceptionThrower();
		
		assertThrows(ArithmeticException.class,()->exp.throwException());
	}

}
