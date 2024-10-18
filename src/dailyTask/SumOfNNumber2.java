package dailyTask;
import java.util.*;
public class SumOfNNumber2 {
	public static int sumOfNaturalNumbers(int n) {
	
		int sum=0;
		  if(n%3==0&&n%8==0) {
				sum+=n;
		}
		System.out.println(sum);
		return n;
		}
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.println("enter number:");
		int n=data.nextInt();
//		if(n%2==0) {
		sumOfNaturalNumbers(n);
//       }else {
//    	   System.out.println("The number is not even number");
//       }

	}
	}
