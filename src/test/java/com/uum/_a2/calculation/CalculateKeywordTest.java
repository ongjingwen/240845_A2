/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.calculation;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import readFile.ReadTextFile;

/**
 *
 * @author user
 */
public class CalculateKeywordTest {
    
    public CalculateKeywordTest() {
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
     * Test of ReadKeyword method, of class CalculateKeyword.
     */
    @Test
    public void testReadKeyword() {
        
        System.out.println("ReadKeyword");
        String str = "";
        String filename1= "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
        String absoluteFilePath = "";
        String workingDirectory = System.getProperty("user.dir");
        absoluteFilePath = workingDirectory + File.separator + filename1;
        ReadTextFile r = new ReadTextFile();
        
        String file = r.ReadFile(absoluteFilePath);
        CalculateKeyword instance = new CalculateKeyword();
        int[] expResult =  instance.ReadKeyword(file);
        int[] result = instance.ReadKeyword(str);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
