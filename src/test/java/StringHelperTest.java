import com.example.helper.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper;
	
	@Before
	public void setup() {
		System.out.println("Executing");
		stringHelper = new StringHelper();
	}
	// Sample JUnit Test
	@Test
	public void truncateAInFirst2PositionsTest_2() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void truncateAInFirst2PositionsTest_1() {
		assertEquals("CDA", stringHelper.truncateAInFirst2Positions("ACDA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_1() {
		assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse("Condition Failed", stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_2() {
		assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue("Condition Passed", stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@After
	public void teardown() {
		System.out.println("After Test.");
	}

}
