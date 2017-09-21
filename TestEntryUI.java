package bcccp.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Date;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bcccp.carpark.entry.EntryController;
import bcccp.carpark.entry.EntryUI;
import bcccp.carpark.entry.IEntryController;

public class TestEntryUI {

	static EntryUI entryUI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		entryUI=new EntryUI(320, 100);
		entryUI.setVisible(true);
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
	public void testPrintTicketM()throws Exception {
		String carparkId="CAR1232";
		int tNo=123121;
		Date datetime=new Date();
		String barcode="1234123412341234";
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n");
		builder.append("Ticket No  : " + tNo + "\n");
		builder.append("Entry Time : " + datetime + "\n");
		builder.append("Barcode    : " + barcode + "\n");
		
		entryUI.printTicket(carparkId, 123121,datetime.getTime() , barcode);
		Field f = Class.forName("bcccp.carpark.entry.EntryUI").getDeclaredField("ticketPrinterTextArea");
		f.setAccessible(true);
		JTextArea s = (JTextArea) f.get(entryUI);
		assertEquals(builder.toString(),s.getText());
	}
	
	@Test
	public void testPrintTicket() {
		entryUI.printTicket("CAR1232", 123121,new Date().getTime() , "1234123412341234");
		assertTrue(entryUI.ticketPrinted());
	}
	
	@Test
	public void testTicket() {
		assertTrue(entryUI.ticketPrinted());
	}
	@Test
	public void testRegisterController()throws Exception {
		IEntryController controller=new EntryController(null,null,null,null,null);
		entryUI.registerController(controller);
		Field f = Class.forName("bcccp.carpark.entry.EntryUI").getDeclaredField("controller");
		f.setAccessible(true);
		IEntryController s = (IEntryController) f.get(entryUI);
		assertNotNull(s);
	}
	@Test
	public void testDeRegisterController()throws Exception {
		IEntryController controller=new EntryController(null,null,null,null,null);
		entryUI.deregisterController();
		Field f = Class.forName("bcccp.carpark.entry.EntryUI").getDeclaredField("controller");
		f.setAccessible(true);
		IEntryController s = (IEntryController) f.get(entryUI);
		assertNull(s);
	}
	
	@Test
	public void testDisplay()throws Exception {
		String message="Message";
		entryUI.display(message);
		Field f = Class.forName("bcccp.carpark.entry.EntryUI").getDeclaredField("displayTextField");
		f.setAccessible(true);
		JTextField s = (JTextField) f.get(entryUI);
		assertEquals(message,s.getText());
	}
}
