package bcccp.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import javax.swing.JTextField;

import org.junit.Test;

import bcccp.carpark.exit.ExitUI;

public class TestDisplayEXit {
	static ExitUI exitUI;

	@Test
	public void test()throws Exception {
		exitUI.display("TCKT123456");
		Field f = Class.forName("bcccp.carpark.exit.ExitUI").getDeclaredField("displayTextField");
		f.setAccessible(true);
		JTextField s = (JTextField) f.get(exitUI);
		assertEquals(s.getText(),"TCKT123456");
	}


	}

