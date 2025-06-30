import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class PerformanceTesterTest {

	@Test
	void test() {
		PerformanceTester ob=new PerformanceTester();
		assertTimeout(Duration.ofMillis(200),()->ob.performTask());
	}

}
