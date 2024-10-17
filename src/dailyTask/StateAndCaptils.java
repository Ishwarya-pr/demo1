package dailyTask;
import java.util.Arrays;
import java.util.HashMap;

public class StateAndCaptils {
	public static  HashMap<String, String> getStates(String data,String del1,String del2){
		HashMap<String, String> StatesMap=new HashMap<>();
		String captil[] =data.split(del2);
		System.out.println(Arrays.toString(captil));
		
		for(String captils : captil ) {
			String[] state = captils.split(del1);
			System.out.println(Arrays.toString(state));
			if(state.length==2) {
				StatesMap.put(state[0].trim(),  state[1].trim());		
			}
		}
		return StatesMap;
	}
	public static void main(String[] args) {
        String data = " tamilnadu||chennai-karanataka||bengaluru";
        String del1 = "\\|\\|";
        String del2 = "-";
        
      HashMap<String,String> result =new HashMap<>(getStates(data,del1,del2));
      System.out.println(result);
	}
}
