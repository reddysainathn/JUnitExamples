import static org.junit.Assert.assertEquals;
import com.example.helper.*;
import org.junit.Test;

public class StringHelperTest {
	//Sample JUnit Test
	@Test
	public void test() {
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
	
	}

}
