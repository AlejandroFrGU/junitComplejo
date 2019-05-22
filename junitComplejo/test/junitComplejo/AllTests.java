package junitComplejo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComplejoTest.class, Complejo2Test.class, ComplejoParametrizedTest.class })
public class AllTests {

	
}
