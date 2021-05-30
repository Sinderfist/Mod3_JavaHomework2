package homework2;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to replace the second element of a ArrayList with the specified element.
		
//		Create an array List of words
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("These");
		arr.add("are");
		arr.add("words");
		arr.add("added");
		arr.add("to");
		arr.add("the");
		arr.add("list");
		System.out.println("Original Array"  + arr);
		
		
//		.set is a method that replaces elements in an array at specific indexes of that array
//		with the second parameter being the replacement string or integer
		
		arr.set(3, "*******");
		System.out.println("New Array :" + arr);
		
	}

}
