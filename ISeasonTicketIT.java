/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.season;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Excess Tech
 */
public class ISeasonTicketIT {
    
    public ISeasonTicketIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class ISeasonTicket.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ISeasonTicket instance = new ISeasonTicketImpl();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarparkId method, of class ISeasonTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        ISeasonTicket instance = new ISeasonTicketImpl();
        String expResult = "";
        String result = instance.getCarparkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartValidPeriod method, of class ISeasonTicket.
     */
    @Test
    public void testGetStartValidPeriod() {
        System.out.println("getStartValidPeriod");
        ISeasonTicket instance = new ISeasonTicketImpl();
        long expResult = 0L;
        long result = instance.getStartValidPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndValidPeriod method, of class ISeasonTicket.
     */
    @Test
    public void testGetEndValidPeriod() {
        System.out.println("getEndValidPeriod");
        ISeasonTicket instance = new ISeasonTicketImpl();
        long expResult = 0L;
        long result = instance.getEndValidPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inUse method, of class ISeasonTicket.
     */
    @Test
    public void testInUse() {
        System.out.println("inUse");
        ISeasonTicket instance = new ISeasonTicketImpl();
        boolean expResult = false;
        boolean result = instance.inUse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordUsage method, of class ISeasonTicket.
     */
    @Test
    public void testRecordUsage() {
        System.out.println("recordUsage");
        IUsageRecord record = null;
        ISeasonTicket instance = new ISeasonTicketImpl();
        instance.recordUsage(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentUsageRecord method, of class ISeasonTicket.
     */
    @Test
    public void testGetCurrentUsageRecord() {
        System.out.println("getCurrentUsageRecord");
        ISeasonTicket instance = new ISeasonTicketImpl();
        IUsageRecord expResult = null;
        IUsageRecord result = instance.getCurrentUsageRecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endUsage method, of class ISeasonTicket.
     */
    @Test
    public void testEndUsage() {
        System.out.println("endUsage");
        long dateTime = 0L;
        ISeasonTicket instance = new ISeasonTicketImpl();
        instance.endUsage(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsageRecords method, of class ISeasonTicket.
     */
    @Test
    public void testGetUsageRecords() {
        System.out.println("getUsageRecords");
        ISeasonTicket instance = new ISeasonTicketImpl();
        List<IUsageRecord> expResult = null;
        List<IUsageRecord> result = instance.getUsageRecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ISeasonTicketImpl implements ISeasonTicket {

        public String getId() {
            return "";
        }

        public String getCarparkId() {
            return "";
        }

        public long getStartValidPeriod() {
            return 0L;
        }

        public long getEndValidPeriod() {
            return 0L;
        }

        public boolean inUse() {
            return false;
        }

        public void recordUsage(IUsageRecord record) {
        }

        public IUsageRecord getCurrentUsageRecord() {
            return null;
        }

        public void endUsage(long dateTime) {
        }

        public List<IUsageRecord> getUsageRecords() {
            return null;
        }
    }
    
}
