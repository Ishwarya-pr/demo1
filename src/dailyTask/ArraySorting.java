package dailyTask;

import java.util.*;

public class ArraySorting {
	
	public static void sortingArray(int a[]) {
	//	ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			String con=Integer.toString(a[i]);
		    String r= new StringBuilder(con).reverse().toString();
		    a[i]=Integer.parseInt(r);
		}
	}

	public static void main(String[] args) {
		int a[]= {12,23,96,45};
		
		sortingArray(a);
		
		ArrayList<Integer> arr=new ArrayList<>();
		for(int a1:a) {
			arr.add(a1);
		}
		
		Collections.sort(arr);
		System.out.println(arr);

	}

}