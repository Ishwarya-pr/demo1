package dailyTask;

import java.util.*;

public class VoterList {
	public static List<String> getVoterList(Map<String, String> voters){
		List<String> eligibleVoters=new ArrayList<>();
		for(Map.Entry<String, String> entry:voters.entrySet()) {
			String id=entry.getKey();
			String dob=entry.getValue();
		if(getDOB(dob)>=18) {
			eligibleVoters.add(id);
		}
	}
		return eligibleVoters;
	}
	public static int getDOB(String dob) {
		
        String datepart[] = dob.split("/");
		
		int day = Integer.parseInt(datepart[0]);
		int month = Integer.parseInt(datepart[1])-1;
		int year = Integer.parseInt(datepart[2]);
		
		Calendar dobcal = new GregorianCalendar(year,month,day);
		Calendar present= Calendar.getInstance();
		int age=present.get(Calendar.YEAR)-dobcal.get(Calendar.YEAR);
		if(present.get(Calendar.DAY_OF_YEAR)<dobcal.get(Calendar.DAY_OF_YEAR)) {
		System.out.println(age);
		}
		return age;
		
		
	}

	public static void main(String[] args) {
		Map<String,String> voters=new HashMap<>();
		voters.put("ID01", "25/06/2000");
		voters.put("ID02", "25/06/2020");
		List<String>list=getVoterList(voters);
		System.out.println(list);

	}

}
