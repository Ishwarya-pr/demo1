package dailyTask;

import java.util.*;

public class PerfectCouple {
	public static List<Integer> checkPerfectCouple(HashMap<Integer,String>couple){
		List<Integer> nameList= new ArrayList<>();

		for(Map.Entry<Integer, String> entry:couple.entrySet()) {
			int id=entry.getKey();
			String names=entry.getValue();
		
		String[]n= names.split("-");
		char []ch1= n[0].toCharArray();
		char []ch2=n[1].toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) nameList.add(id); 
		}
		return nameList;	
	}
	public static void main(String[] args) {
	HashMap<Integer,String> coupleList=new HashMap<>(); 
	coupleList.put(01, "RAVI-VANI");
	coupleList.put(02, "VIMAL-MALIV");
	coupleList.put(03, "NAIDU-LAKSHMI");
	coupleList.put(04, "REVANTH-REVATHI");
	coupleList.put(05, "LUCKA-AKCUL");
	coupleList.put(06, "MAHI-HIMA");
    
	System.out.println(checkPerfectCouple(coupleList));
	}
}
