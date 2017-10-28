/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.calculation;

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
public class CalculateLinesTest {
    
    public CalculateLinesTest() {
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
     * Test of countNumLines method, of class CalculateLines.
     */
    @Test
    public void testCountNumLines() {
        System.out.println("countNumLines");
        String str = "";
        CalculateLines instance = new CalculateLines();
        String expResult = "";
        String result = instance.countNumLines(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countActualLines method, of class CalculateLines.
     */
    @Test
    public void testCountActualLines() {
        System.out.println("countActualLines");
        String str = "";
        CalculateLines instance = new CalculateLines();
        String expResult = "";
        String result = instance.countActualLines(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countEmptyLines method, of class CalculateLines.
     */
    @Test
    public void testCountEmptyLines() {
        System.out.println("countEmptyLines");
        String str = "";
        CalculateLines instance = new CalculateLines();
        String expResult = "";
        String result = instance.countEmptyLines(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countCommentLines method, of class CalculateLines.
     */
    @Test
    public void testCountCommentLines() {
        System.out.println("countCommentLines");
        String str = "";
        CalculateLines instance = new CalculateLines();
        String expResult = "";
        String result = instance.countCommentLines(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
