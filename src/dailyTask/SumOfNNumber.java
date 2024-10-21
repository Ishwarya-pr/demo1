package dailyTask;
import java.util.*;
public class SumOfNNumber {
	public static int calcuateSum(int n1) {
		int sum=0;
		//int n=6;
		for(int i=1;i<=n1;i++) {
			if(i%3==0 ||i%5==0) {
			sum+=i;
			}
		}
		
		System.out.println("sum of "+n1+" natural number is " +sum);
		return sum;
	}

	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("enter natural number:");
	int n1 = n.nextInt();
		calcuateSum(n1);
	}
}
	
