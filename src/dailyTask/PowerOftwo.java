package dailyTask;
import java.util.*;
public class PowerOftwo {
	public static boolean checkNumber(int n) {
	   
		
		
		while(n%2==0) {
			n/=2;
			
		}
		if (n==1) {
			return true;
		}
		else return false;	
	
	}

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter number: ");
		int n= d.nextInt();
		System.out.println(checkNumber(n));
		
		
		
		d.close();
	}
    
}
