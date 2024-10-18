package dailyTask;

import java.util.HashMap;

public class CountCharacter {
	public static HashMap<Character,Integer> countCharacter(char data[]){
		HashMap<Character,Integer> charmap= new HashMap<>() ;
		for(char c :data) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}
		}	
		return charmap;
	}

	public static void main(String[] args) {
		char data[]={'a','p','p','l','e'};
		
		HashMap<Character,Integer> result =new HashMap<>(countCharacter(data));
		System.out.println(result);
         
	}

}
