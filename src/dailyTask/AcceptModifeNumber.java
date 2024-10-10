package dailyTask;
import java.util.*;
public class AcceptModifeNumber {

	public static int modifyNumber(int n) {
		String num= Integer.toString(n);
		StringBuffer s= new StringBuffer();
		for(int i=0;i<num.length()-1;i++) {
			
			int cd=Character.getNumericValue(num.charAt(i));
			//char.getnumricvalaue method is used to convert digits char to numerics
			
			int nd=Character.getNumericValue(num.charAt(i+1));
			
			int com;
			if(cd>nd) {
				com=cd-nd;
			}
			else {
				com=nd-cd;
			}	
			s.append(com);
			
		}
		s.append(num.charAt(num.length()-1));
		String sr=s.toString();
		int c=Integer.parseInt(sr);
		
		return c;	
	}
	
	public static void main(String args[]) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter number: ");
		int n= d.nextInt();
		System.out.println("the modifiy number of "+n+" is "+modifyNumber(n));		
		d.close();
	}
	
	
	
}
