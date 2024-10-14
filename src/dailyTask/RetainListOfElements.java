package dailyTask;

import java.util.ArrayList;
import java.util.List;

public class RetainListOfElements {
	public static String retainElements(List<String>List1, List<String>List2) {
		
		System.out.println(List1);
		
		List1.retainAll(List2);
		System.out.println(List1);
		
		
		return null;	
	}
	public static void main(String[] args) {
		List<String> List1= new ArrayList<>();
		 List1.add("Ishwarya");
		 List1.add("chandu");
		 List1.add("deshak");
		 List1.add("sai kiran");
		 List1.add("divakar");
		 List1.add("lokesh");
		 List1.add("Swathi");
		
		List<String> List2= new ArrayList<>();
		 List2.add("Ishwarya");
		 List2.add("Swathi");
		 
		 retainElements(List1,List2);

	}

}
