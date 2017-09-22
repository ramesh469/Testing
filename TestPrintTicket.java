package bcccp.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestPrintTicket {

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
	}

}
