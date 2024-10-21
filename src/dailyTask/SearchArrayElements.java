package dailyTask;

import java.util.*;

public class SearchArrayElements {
	public static void modifyElements(List<String>listu,String result) {
		
		for(int i=0;i<listu.size();i++) {
			String data= listu.get(i);
			if(data.equals(result)) {
				int half= data.length()/2;
				listu.set(i,data.substring(0,half));
          	}
		}	
	}
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("deshak");
		list.add("Ishwarya");
		list.add("chandu");
		list.add("sai");
		list.add("divkar");
		list.add("lokesh");	
		String element= "sai";
		modifyElements(list,element);
		System.out.println(list);
	}
}
