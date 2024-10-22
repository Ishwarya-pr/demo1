package dailyTask;

import java.util.LinkedHashSet;

public class UserChoiceString {

	public static String changeString(String input, char c) {
		 c= Character.toUpperCase(c);
		 switch(c) {
		 case 'A': String s = input.concat(input);
		 return s;
		 case 'B': String change1= replace(input);
		 return change1;
		 case 'C': String change2=  remove(input);
		 return change2;
		 case 'D': String change3= caseChange(input);
		 return change3;
		 default:
			 return "enter properly!!";
		 }
	}
	public static String replace(String s) {
       	  StringBuffer modifiedStr = new StringBuffer("");
       	  char[] charArray = s.toCharArray();
       	  for(int i=0;i<charArray.length;i++) {
       		  if(i%2==0) modifiedStr.append("*");
       		  else modifiedStr.append(charArray[i]);
       	  }
       	  String afterBuild = modifiedStr.toString();
       	  return afterBuild;
         }
	public static String remove(String s) {
		s = s.toLowerCase();
		char[] charArray = s.toCharArray();
		StringBuffer modified = new StringBuffer("");
		LinkedHashSet<Character> uniqueElements = new LinkedHashSet<Character>();
		for(char singleChar: charArray) {
			uniqueElements.add(singleChar);
		}
		System.out.println(uniqueElements);

		for(char ch:uniqueElements) {
			modified.append(ch);
		}
		return modified.toString();
	}
	
	public static String caseChange(String s) {
		char [] charArray =s.toCharArray();
		StringBuffer upperLower = new StringBuffer("");
		for(int i=0;i<charArray.length;i++) {
			
			if(i%2==0) upperLower.append(Character.toUpperCase(charArray[i]));
			else upperLower.append(Character.toLowerCase(charArray[i]));
		}
		return upperLower.toString();
	}
	public static void main(String[] args) {
		System.out.println(changeString("Psycho",'D'));
		
		
	}

}
