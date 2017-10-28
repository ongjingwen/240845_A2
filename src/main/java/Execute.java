import java.util.Arrays;

import com.uum._a2.calculation.CalculateKeyword;
import com.uum._a2.calculation.CalculateLines;
import readFile.ReadTextFile;
import readInfo.ReadInfo;
import total.Total;

public class Execute {
	
	public String[] Execute(String path){
		//declare 
	ReadTextFile r = new ReadTextFile();
	ReadInfo ri = new ReadInfo();
	CalculateKeyword rk = new CalculateKeyword();
	CalculateLines c = new CalculateLines();
	Total t = new Total();
	
	// getterS
	String file = r.ReadFile(path);
	String [] info = ri.ReadInfo(file);
	String LOC = c.countNumLines(file);
	String LOBlank = c.countEmptyLines(file);
	String LOComment = c.countCommentLines(file);
	String actualLOC = c.countActualLines(file);
	int [] key = rk.ReadKeyword(file);
	String[] numkey=Arrays.toString(key).split("[\\[\\]]")[1].split(", "); 
	String total = t.Total(actualLOC, key);
	

	return new String[] { info[0],info[1],info[2],info[3],info[4],LOC ,LOBlank ,LOComment ,actualLOC,numkey[0],
			numkey[1],numkey[2],numkey[3],numkey[4],numkey[5],numkey[6],total};
	}
	
	
	
	
	
}
