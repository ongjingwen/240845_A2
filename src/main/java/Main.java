import java.io.File;
import writeExcel.WriteExcel;

public class Main {

	public static void main(String[] args) {
		WriteExcel w = new WriteExcel();
		//String file1 = "TestFile/Assignment2_TestFiles/MyThread1.java";
		//String file2 = "TestFile/Assignment2_TestFiles/MyThread2.java";
                String filename1= "TestFIle\\Assignment2_TestFiles\\MyThread1.java";
                String filename2= "TestFIle\\Assignment2_TestFiles\\MyThread2.java";
                String workingDirectory = System.getProperty("user.dir");

		//****************//

		String absoluteFilePath = "";
                String absoluteFilePath2 = "";
		//absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
		absoluteFilePath = workingDirectory + File.separator + filename1;
                absoluteFilePath2 = workingDirectory + File.separator + filename2;
		
                System.out.println("Final filepath : " + absoluteFilePath);

		Execute e = new Execute();
		String[] result1 = e.Execute(absoluteFilePath);
		String[] result2 = e.Execute( absoluteFilePath2);
		w.WriteExcel(result2,result1);
		
	}
}
