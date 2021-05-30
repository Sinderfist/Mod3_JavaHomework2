package homework2;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Write a Java program to extract a portion of a array list
		
		
//		Create an array of words 
		ArrayList<String> originalList = new ArrayList<String>();
		
		originalList.add("Show");
		originalList.add("Me");
		originalList.add("The");
		originalList.add("Money");
		originalList.add("These");
		originalList.add("words");
		originalList.add("won't");
		originalList.add("be");
		originalList.add("shown");
		System.out.println("Original List: " + originalList);
		
		
//		.subList is a method that extracts a portion of arrays between the parameter of integers specified
		List<String> extractedList = originalList.subList(0,4);
		System.out.println("Extracted List: "+ extractedList);
	
	}

}
