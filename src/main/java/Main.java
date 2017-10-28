import writeExcel.WriteExcel;

public class Main {

	public static void main(String[] args) {
		WriteExcel w = new WriteExcel();
		String file1 = "TestFile/Assignment2_TestFiles/MyThread1.java";
		String file2 = "TestFile/Assignment2_TestFiles/MyThread2.java";

		Execute e = new Execute();
		String[] result1 = e.Execute(file1);
		String[] result2 = e.Execute(file2);
		w.WriteExcel(result2,result1);
		
	}
}
