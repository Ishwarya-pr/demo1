package dailyTask;

public class ReverseString {
	public static String getimage() {
		String input= "EARTH";
		StringBuffer sb=new StringBuffer(input);
		 String b=sb.reverse().toString();
		System.out.println(input+"|"+b );
		return input;
		
	}

	public static void main(String[] args) {
		//Method2 a=new Method2();
		getimage();

	}

}
