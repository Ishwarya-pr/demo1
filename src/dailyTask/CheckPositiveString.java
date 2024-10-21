package dailyTask;

public class CheckPositiveString {
public static boolean checkPositive(String input) {
	 char [] charArray= input.toCharArray();
	 for(int i=0; i<charArray.length-1;i++) {
		int diff = charArray[i+1]-charArray[i];
		 System.out.println(diff);
		if(diff<0) {
			return false;
		}
	 }
		return true;
	}
	public static void main(String[] args) {
		
		String input= "ANT";
		System.out.println(checkPositive(input));
	
			
/*we can get ASCII valuse to particular charter like below
 *      int num= (int)'L';
    	System.out.println(num);
    	
 * 
 */

	}

}
