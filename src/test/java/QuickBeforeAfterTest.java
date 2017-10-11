import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	// @BeforeClass,@AfterClass must be static only.
	// DB connections must be provided in @BeforeClass and closed in @AfterClass
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class.");
	}

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
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class.");
	}
}
