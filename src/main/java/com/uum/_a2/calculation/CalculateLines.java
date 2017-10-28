package calculation;

import java.util.Scanner;
public class CalculateLines {
	public String countNumLines(String str){
		   String[] lines = str.split("\r\n|\r|\n");		   
		   return Integer.toString( lines.length);
		}
	
	public String countActualLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str); 
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		 if (!currentline.equals(""))
			 count++;
             if (currentline.contains("//"))
            	 count--;           
		}
		return Integer.toString(count) ;
	}
	
	public String countEmptyLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str);
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		
		 if (currentline.isEmpty())
			 count++;
		}
		return Integer.toString(count) ;
	}
	
	public String countCommentLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str); 
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		 if (!currentline.equals(""))
			 if (currentline.contains("//"))
            	 count++;		    
		}
		return Integer.toString(count) ;
	}
}
