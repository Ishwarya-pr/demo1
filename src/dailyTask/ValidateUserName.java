package dailyTask;
import java.util.*;
public class ValidateUserName {
	 static Boolean validName() {
		Scanner d=new Scanner(System.in);
		
		System.out.println("enter the name: ");
		String name= d.nextLine();
		int n=name.length();
		if( name==null || !name.contains("_job")||( n-4)<=8) {
			 return false;
		}
	
		else {
			
		return true;
		
		}
	}
	public static void main(String[] args) {
	
	System.out.println(validName());
	
	

	}

}
