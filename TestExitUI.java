package bcccp.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bcccp.carpark.exit.ExitUI;

public class TestExitUI {
	static ExitUI exitUI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		exitUI=new ExitUI(1000, 100);
		exitUI.setVisible(true);
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
	public void test()throws Exception {
		exitUI.display("TCKT123456");
		Field f = Class.forName("bcccp.carpark.exit.ExitUI").getDeclaredField("displayTextField");
		f.setAccessible(true);
		JTextField s = (JTextField) f.get(exitUI);
		assertEquals(s.getText(),"TCKT123456");
	}

}
