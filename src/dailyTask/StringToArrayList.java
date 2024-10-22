package dailyTask;

import java.util.*;

public class StringToArrayList {
	public static ArrayList<String> getArrayList(String[] s){
		ArrayList<String> list= new ArrayList<>(Arrays.asList(s));
		Collections.sort(list);
		
		int middleElement = list.size()/2==0? list.size()/2:list.size()/2+1;
		for(int i=0;i<list.size();i++) {
			if(i<middleElement) {
				list.set(i, list.get(i).toUpperCase());
			}else {
				list.set(i, list.get(i).toLowerCase());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String [] s = {"zoo","code","frnds","Office","people"};
		
		System.out.println(getArrayList(s));
	}

}
