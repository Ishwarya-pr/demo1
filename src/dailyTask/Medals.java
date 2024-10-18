package dailyTask;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Medals {
	public static HashMap<String,String> getStudentMedals(HashMap<String,Integer>Marks) {
	  HashMap<String,String> studentMedals= new HashMap<>();
	  
	  for(Map.Entry<String, Integer>entry : Marks.entrySet()) {
	   int marks=entry.getValue();
	   String id=entry.getKey();
	  // System.out.println(marks);
	  if(marks>=90) {
		  studentMedals.put(id, "Gold");
	  } else if(marks>=80 && marks<90) {
		studentMedals.put(id, "Silver");
	  } else if(marks>=70 && marks<80) {
		studentMedals.put(id, "Bronze");
	  } else {
		  studentMedals.put(id, "No Medal");
	  }
  }
	return studentMedals;
	}
 	public static void main(String[] args) {
		
		HashMap<String,Integer> Marks =new HashMap<>();
		Marks.put("WWT101", 95);
		Marks.put("WWT102", 85);
		Marks.put("WWT103", 70);
		Marks.put("WWT104", 50);
		Marks.put("WWT105", 69);
		
		HashMap<String,String> MedalAwards= new HashMap<>(getStudentMedals(Marks));
		for(Entry<String, String> entry1:MedalAwards.entrySet()) {
			System.out.println(entry1.getKey()+">>>"+entry1.getValue());
		}
	}
}
