package dailyTask;
import java.util.*;
public class IncressingNumber {

	public static boolean checkNumber(int n) {
		String numstr= Integer.toString(n);//convert number to string
		boolean f=false;
		for(int i=0;i<numstr.length()-1;i++) {
			if(numstr.charAt(i)<=numstr.charAt(i+1)) {
				 f=true;
		}
			else {
				f=false;
				break;
			}
		}
		return f;
	}
	
	public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("enter number: ");
	int n=d.nextInt();
    System.out.println(checkNumber(n));
    
    d.close();
	}

}
