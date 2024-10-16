package dailyTask;

import java.util.HashMap;

public class SquareInMap {
	
	public static HashMap<Integer,Integer>getSquare(int a[]){
	
		
		HashMap<Integer, Integer> m= new HashMap<>();
	
		for(int i=0;i<a.length;i++) {
			//int sum=0;
			
		//sum+= i*i;
		m.put(a[i],a[i]*a[i]);
		}
		
		return m;
	}

	public static void main(String[] args) {
		 int a[]= {2,3,5,6,10};
		 System.out.println(getSquare(a));
		 
		 HashMap<Integer, Integer> m= getSquare(a);
		 System.out.println(m);
	
	}

}
