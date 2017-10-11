import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
// Organizing Unit Tests into Suites.
@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class })
public class AllTests {

}
