/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.season;

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
public class IUsageRecordIT {
    
    public IUsageRecordIT() {
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
     * Test of finalise method, of class IUsageRecord.
     */
    @Test
    public void testFinalise() {
        System.out.println("finalise");
        long endDateTime = 0L;
        IUsageRecord instance = new IUsageRecordImpl();
        instance.finalise(endDateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartTime method, of class IUsageRecord.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        IUsageRecord instance = new IUsageRecordImpl();
        long expResult = 0L;
        long result = instance.getStartTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class IUsageRecord.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        IUsageRecord instance = new IUsageRecordImpl();
        long expResult = 0L;
        long result = instance.getEndTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeasonTicketId method, of class IUsageRecord.
     */
    @Test
    public void testGetSeasonTicketId() {
        System.out.println("getSeasonTicketId");
        IUsageRecord instance = new IUsageRecordImpl();
        String expResult = "";
        String result = instance.getSeasonTicketId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IUsageRecordImpl implements IUsageRecord {

        public void finalise(long endDateTime) {
        }

        public long getStartTime() {
            return 0L;
        }

        public long getEndTime() {
            return 0L;
        }

        public String getSeasonTicketId() {
            return "";
        }
    }
    
}
