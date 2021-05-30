package homework2;

import java.util.ArrayList;
import java.util.Collections;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program of swap two elements in an array list
		
		
//		Create an array of strings
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("number 1");
		arr.add("number 2");
		arr.add("number 3");
		arr.add("number 4");
		arr.add("number 5");
		System.out.println("Before the swap: " + arr);
		
		
//		.swap is a collections method in which it swaps two indexes in an array
		Collections.swap(arr, 0, 4);
		System.out.println("After the swap:" + arr);
		
	
	}

}
