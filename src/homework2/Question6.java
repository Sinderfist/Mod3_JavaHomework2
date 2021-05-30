package homework2;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to trim the capacity of an array list the current list size
		
//		Create a list of strings with a set size value to the arrayList
//		The Array has 50 spots predetermined in the ArrayList
		ArrayList<String> arr = new ArrayList<String>(50);
		
		arr.add("Gonna");
		arr.add("take");
		arr.add("my");
		arr.add("horse");
		arr.add("to");
		arr.add("the");
		arr.add("old");
		arr.add("town");
		arr.add("road");
		
//		trimToSize makes it so that the array stays to the size of the array without the extra indecies
		arr.trimToSize();
		
		
		System.out.println("The song starts like this: ");
		
		for(String lyrics: arr) {
			System.out.println(lyrics);
		}
		
		
		
		
	}

}
