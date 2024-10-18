package dailyTask;
import java.util.*;
public class RemoveDuplicateArray {
	
	public static void modifyArray(int a[]) {
		
		TreeSet<Integer> tt=new TreeSet<>();
		for(int a1:a) {
			tt.add(a1);
		}
		System.out.println(tt);
		Integer[]arr = new Integer[tt.size()];//new array with treeset size
		
		Iterator<Integer> it= tt.descendingIterator();//using Iteractor method
		int index=0;
		while(it.hasNext()) {
			arr[index++]=it.next();
		}
		
		System.out.println(Arrays.toString(arr));//convert into array
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,2,1,6,7,7};
	
         modifyArray(a);
       
         

	}

}
