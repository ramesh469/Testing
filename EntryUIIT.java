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

public class EntryUIIT {

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
	
