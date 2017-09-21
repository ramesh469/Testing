package bcccp.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Date;

import javax.swing.JTextArea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bcccp.carpark.paystation.PaystationUI;

public class TestPayStationUI {
	static PaystationUI paystationUI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		paystationUI=new PaystationUI(660, 100);
		paystationUI.setVisible(true);
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
	public void testPrintTicket() throws Exception{
		String carparkId="C12345";
		int tNo=1234;
		Date entryDate=new Date();
		Date paidDate=new Date();
		float charge=123.0f;
		String barcode="B123456";
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n");
		builder.append("Ticket No  : " + tNo + "\n");
		builder.append("Entry Time : " + entryDate + "\n");
		builder.append("Paid  Time : " + paidDate + "\n");
		builder.append("Charge     : " + String.format("%.2f", charge) + "\n");
		builder.append("Barcode    : " + barcode + "\n");

		paystationUI.printTicket(carparkId, tNo,entryDate.getTime() ,paidDate.getTime(), charge, barcode);
		Field f = Class.forName("bcccp.carpark.paystation.PaystationUI").getDeclaredField("ticketPrinterTextArea");
		f.setAccessible(true);
		JTextArea s = (JTextArea) f.get(paystationUI);
		assertEquals(builder.toString(),s.getText());
	}
}
