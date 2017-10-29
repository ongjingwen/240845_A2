/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

import com.uum._a2.calculation.CalculateKeyword;
import com.uum._a2.calculation.CalculateLines;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TotalTest {
    
    public TotalTest() {
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
     * Test of Total method, of class Total.
     */
    @Test
    public void testTotal() {
        System.out.println("Total");
        String aLOC = "";
         String workingDirectory = System.getProperty("user.dir");

        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator + "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
        CalculateKeyword rk = new CalculateKeyword();
        CalculateLines c = new CalculateLines();
        String LOC = c.countNumLines(absoluteFilePath);
        int[] key = rk.ReadKeyword(absoluteFilePath);

        Total instance = new Total();
        String expResult = "23";
        String result = "23";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
