import com.example.helper.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Should declare @RunWith(Parameterized.class) to make it parameterized JUnit test.

@RunWith(Parameterized.class)
public class StringHelperTest {

	StringHelper stringHelper = new StringHelper();
	private String input;
	private String expectedOutput; 
	
	public StringHelperTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// Test Conditions are placed here and it is static which returns a Collection.
	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void truncateAInFirst2PositionsTest_1() {
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
	}

}
