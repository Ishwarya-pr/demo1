package dailyTask;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArrayList {
	public static <Char> char[] getMergData (ArrayList<Character>charlist1, ArrayList<Character>charlist2){
		ArrayList<Character> mergeArray=new ArrayList<>(charlist1);
		mergeArray.addAll(charlist2);
		System.out.println(mergeArray);
		
		Collections.sort(mergeArray);
		System.out.println(mergeArray);
		
		Character[] array=mergeArray.toArray(new Character[0]);
		char[] charArray = new char[array.length];
		for (int i=0;i<array.length;i++) {
			charArray[i]=array[i];
		}
		 return charArray;			
		}

	public static void main(String[] args) {
		ArrayList<Character> charlist1= new ArrayList<Character>();
		charlist1.add('a');
		charlist1.add('g');
		charlist1.add('h');
		charlist1.add('i');
		charlist1.add('e');
		ArrayList<Character> charlist2= new ArrayList<Character>();
		charlist2.add('f');
		charlist2.add('b');
		charlist2.add('c');
		charlist2.add('d');
		charlist2.add('j');
		getMergData(charlist1,charlist2);

	}

}
