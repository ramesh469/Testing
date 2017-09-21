package bcccp.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bcccp.carpark.Gate;

public class TestGate {
	static Gate egate;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 egate = new Gate(20, 320);
		 egate.setVisible(true);
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

	@Test
	public void test() {
		assertFalse(egate.isRaised());
	}
	
	@Test
	public void testRaised() {
		egate.raise();
		assertTrue(egate.isRaised());
	}
	@Test
	public void testLower() {
		egate.lower();
		assertFalse(egate.isRaised());
	}
}
