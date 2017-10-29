/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.uum._a2.calculation.CalculateKeyword;
import com.uum._a2.calculation.CalculateLines;
import java.io.File;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import readInfo.ReadInfo;
import total.Total;

/**
 *
 * @author user
 */
public class ExecuteTest {

    public ExecuteTest() {
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
     * Test of Execute method, of class Execute.
     */
    @Test
    public void testExecute() {
        System.out.println("Execute");

        //String Directory = sc.nextLine();
        //System.out.println("Your Directory/folder is :" + Directory);
        String workingDirectory = System.getProperty("user.dir");

        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator + "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
        ReadInfo ri = new ReadInfo();
        CalculateLines c = new CalculateLines();
        CalculateKeyword rk = new CalculateKeyword();
        Total t = new Total();

        String LOC = c.countNumLines(absoluteFilePath);
        String LOBlank = c.countEmptyLines(absoluteFilePath);
        String LOComment = c.countCommentLines(absoluteFilePath);
        String actualLOC = c.countActualLines(absoluteFilePath);
        String[] info = ri.ReadInfo(absoluteFilePath);
        int[] key = rk.ReadKeyword(absoluteFilePath);
        String[] numkey = Arrays.toString(key).split("[\\[\\]]")[1].split(", ");
        String total = t.Total(actualLOC, key);
        Execute instance = new Execute();

        String[] expResult = new String[]{"A171","STIW3054","A", "Assignment1", "898989", "24", "4", "6", "14", "1",
           "1","1","2", "2", "1","1", "23"};
        System.out.println(absoluteFilePath);

        String[] result = instance.Execute(absoluteFilePath);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
