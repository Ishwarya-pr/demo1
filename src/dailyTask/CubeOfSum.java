package dailyTask;
import java.util.*;
public class CubeOfSum {
	public static int getSumOfCube(int n) {
		
		int sum=0;
		while(n!=0) {
			int digit= n%10;
			sum+= digit*digit*digit;
			n=n/10;
		}
		System.out.println("sum of the cubes of the input digit is>>>"+sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int n=data.nextInt();
		//System.out.printf("enter:%d%n",n);
		getSumOfCube(n);
		

	}

}
