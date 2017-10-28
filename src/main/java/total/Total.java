package total;

public class Total {
 
	private int total = 0;
	private int totalLOC = 0;
	private int totalkey = 0;
	
	public String Total(String aLOC, int[] key) {
		totalLOC = Integer.parseInt(aLOC);
		for (int i =0 ; i<key.length ;i++){
			totalkey = totalkey + key[i];
		}
		total = totalLOC + totalkey;
		
		return Integer.toString(total); 
	}
	
	
}
