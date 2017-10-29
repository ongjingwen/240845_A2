/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writeExcel;

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
public class WriteExcelTest {
    
    public WriteExcelTest() {
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
     * Test of WriteExcel method, of class WriteExcel.
     */
    @Test
    public void testWriteExcel() {
        System.out.println("WriteExcel");
          String filename1= "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
                String filename2= "TestFIle\\Assignment2_TestFiles\\MyThread2.java";
                String workingDirectory = System.getProperty("user.dir");

		//****************//

		String absoluteFilePath = "";
                String absoluteFilePath2 = "";
		//absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
		absoluteFilePath = workingDirectory + File.separator + filename1;
                absoluteFilePath2 = workingDirectory + File.separator + filename2;
		
        String[] result1 = new String[]{"A171","STIW3054","A", "Assignment1", "898989", "24", "4", "6", "14", "1",
           "1","1","2", "2", "1","1", "23"};
        String[] result2 = new String[]{"A171","STIW3054","A", "Assignment1", "898989", "24", "4", "6", "14", "1",
           "1","1","2", "2", "1","1", "23"};
        WriteExcel instance = new WriteExcel();
        instance.WriteExcel(result1, result2);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
