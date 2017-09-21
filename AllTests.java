package bcccp.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCarSensor.class,
	TestEntryUI.class,
	TestGate.class,
	TestPayStationUI.class
	})
public class AllTests {

}
