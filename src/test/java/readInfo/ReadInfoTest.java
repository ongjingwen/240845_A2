/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readInfo;

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
public class ReadInfoTest {
    
    public ReadInfoTest() {
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
     * Test of ReadInfo method, of class ReadInfo.
     */
    @Test
    public void testReadInfo() {
        System.out.println("ReadInfo");
        String workingDirectory = System.getProperty("user.dir");

        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator + "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
        ReadInfo ri = new ReadInfo();
        String[] info = ri.ReadInfo(absoluteFilePath);
        System.out.println(info);
        String[] expResult = info;
        String[] result = ri.ReadInfo(absoluteFilePath);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
