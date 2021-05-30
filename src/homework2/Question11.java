package homework2;

import java.util.HashSet;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to compare two sets and retain elements which are same on both set
		
//		create a HashSet
		HashSet<String> arr = new HashSet<String>();
		
		arr.add("New");
		arr.add("Words");
		arr.add("Go");
		arr.add("In");
		arr.add("Here");
		
		arr.add("not");
		arr.add("left");
		arr.add("behind");
		
//		create a second HashSet for comparison purposes
		HashSet<String> arr2 = new HashSet<String>();
		
		arr2.add("not");
		arr2.add("left");
		arr2.add("behind");
		
//		.retainAll is a method in Java that allows you to compare two hashsets and retain similar values while not 
//		deleting those already in the set
		
		arr.retainAll(arr2);
		System.out.println("Retained words: ");
		System.out.println(arr);
	}

}
