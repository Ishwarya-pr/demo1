package dailyTask;
import java.util.*;
public class PowerOftwo {
	public static boolean checkNumber(int n) {
	   
		if(n<=0) {
			return false;
		}
		while(n%2==0) {
			n/=2;
		}
		return true ;
	
	}

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter number: ");
		int n= d.nextInt();
		System.out.println(checkNumber(n));
		
		
		
		d.close();
	}
    
}
