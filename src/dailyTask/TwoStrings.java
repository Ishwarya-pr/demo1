package dailyTask;

import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



	public class TwoStrings {
		
		// OCCURANCES COUNT MENTHOD
	    int occurancesCount(String str, String str2) {
	    	String s3 = str.toLowerCase();
	    	String s4 = str2.toLowerCase();
	    	int count =0;
	    	Pattern pattern = Pattern.compile(s4);
	    	Matcher matcher =  pattern.matcher(s3);
	    	while(matcher.find()) {
	    		count++;
	    	}
	    	return count;
	    }
	   // FIRST OCCURANCE METHOD 
	 static int    firstOccurance(String s1, String s2) {
	    	String s3 = s1.toLowerCase();
	    	String s4 = s2.toLowerCase();
	    	int firstOccur =0;
	    	 firstOccur = s3.indexOf(s4);
	    	// System.out.println(s3+" "+s4);
	    	//System.out.println("indexFirst "+firstOccur);
	    	return firstOccur;
	    }
	static  int   lastIndexFind(String string1, String string2) {
	    	String p1 = string1.toLowerCase();
	    	String p2 = string2.toLowerCase();
	    	int lastOccurance = p1.lastIndexOf(p2);
	    	return lastOccurance;
	    	//System.out.println("last"+" "+lastOccurance);
	    }
		
	  static  	void modifyStrings(String string1, String string2){
		  ArrayList<String> elementsList = new ArrayList<String>();
		
		  StringBuilder modify1 = new StringBuilder("");
		  char[] charArray = string1.toCharArray();
		 // CASE:1   
		      for(int i=0;i<charArray.length;i++) {
		    	if(i%2!=0)  modify1.append(charArray[i]);
		    	else modify1.append(string2);
		      }
		      String modified1 = modify1.toString();
		      elementsList.add(modified1); // added First Element into List
		     
		      
		      // CASE:2 
		     TwoStrings countOccur = new TwoStrings();
		      int num = countOccur.occurancesCount(string1, string2);
		    //  System.out.println(num);
		     
		      if(num>1) {
		    	  
		    int lastIndex =	  lastIndexFind(string1,string2);
		    	 
		    	 
		    	  int c1 =0; int c2 = string2.length();
		    	  StringBuilder modify2 = new StringBuilder("");
		    	  for(int i=0;i<charArray.length;i++) {
		    		  if(i==lastIndex) {
		    			  String reverse = new StringBuilder(string2).reverse().toString();
		    			  modify2.append(reverse);
		    			  break;
		    		  }
		    		  else modify2.append(charArray[i]);
		    		  c1++;
		    	  }
		    	  int c3 = c1+c2;
		    	
		    	  for(int i=c3;i<charArray.length;i++) modify2.append(charArray[i]);
		    	//  System.out.println(modify2);
		    	  String modified2 = modify2.toString();
		    	  elementsList.add(modified2);
		    	  
		    	  
		    	  
		    	// && CASE:3
		    	  StringBuilder modify3 = new StringBuilder("");
		    	 
		    	  int  first = firstOccurance(string1,string2);
		    	  int end = first+string2.length();
		    	  for(int i=0;i<first;i++) modify3 = modify3.append(charArray[i]);
		    	  for(int i=end;i<charArray.length;i++) 	  modify3 = modify3.append(charArray[i]);
		    	//  System.out.println(end);
		    	String modified3 = modify3.toString();
		    	  elementsList.add(modified3);
		      }
		      else {
		    	  elementsList.add(string1+string2);
		    	  elementsList.add(string1);
		      }
		      
		      
		      
	               //  CASE:4 
		      int str2Length = string2.length();
		      int mid =0;
		      if(str2Length%2==0) mid = str2Length/2;
		      else mid = str2Length/2+1;
		      
		      String firstPart = string2.substring(0,mid);
		      String lastPart =  string2.substring(mid);
		      elementsList.add(firstPart+string1+lastPart);
		      
		      StringBuilder modify5 = new StringBuilder("");
		      // CASE :5
	    char [] chArray2 = string2.toCharArray();
	            for(int j=0;j<charArray.length;j++) {
	            	boolean flag = false;
	            	char p1 = charArray[j];
	            	char p2 = Character.toLowerCase(charArray[j]);
	            	for(int k=0;k<chArray2.length;k++) {
	            		char p3 = Character.toLowerCase(chArray2[k]);
	            		if(p2==p3) flag = true;
	            		
	            	}
	            	if (flag) modify5.append("*");
	            	else modify5.append(p1);
	            }
	            String modified5 = modify5.toString();
	            elementsList.add(modified5);
		      
		      System.out.println(elementsList); // Prints the ArrayList
		}
		public static void main(String[] args) {
	   
			modifyStrings("JAVAJAVA","JA");
		}
	}
