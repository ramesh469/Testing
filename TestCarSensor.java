package bcccp.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import bcccp.carpark.CarSensor;

public class TestCarSensor {
	static CarSensor frame;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		frame = new CarSensor("Car Detector", 100, 100);
		frame.setVisible(true);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void testCarDetection() {
		assertFalse(frame.carIsDetected());
	}
	@org.junit.Test
	public void testId() {
		assertEquals("Car Detector",frame.getId());
	}
}
