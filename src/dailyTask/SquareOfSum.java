package dailyTask;


public class SquareOfSum {
	public static int square() {
		int a= 3;
		int sum=0;int s=0;
		for(int i=0;i<=a;i++) {
	
			sum +=i*i;
		}
		for(int j=0;j<=a;j++) {
			s+=j;
		}
		System.out.println(sum -(s*s));
		return s;
	}

	public static void main(String[] args) {
		
		//System.out.println(s*s);
		square();
	}
}
