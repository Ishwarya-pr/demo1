package dailyTask;

public class SumOfNNumber {
	public static int calcuateSum() {
		int sum=0;
		int n=6;
		for(int i=1;i<=n;i++) {
			if(i%3==0 ||i%5==0) {
			sum+=i;
			}
		}
		
		System.out.println("sum of "+n+" natural number is " +sum);
		return sum;
	}

	public static void main(String[] args) {
	
		calcuateSum();
	}
}
	
