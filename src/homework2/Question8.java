package homework2;

import java.util.HashSet;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to get the number of elements in a hash set
		
//		create a HashSet to perform test
		HashSet<Integer> arr = new HashSet<Integer>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		
//		.size is a method in Java to give the length of a HashSet
		System.out.println(arr.size()); 
	}

}
