import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("test1 Executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 Executed");
	}

	@After
	public void teardown() {
		System.out.println("After Test.");
	}
}
