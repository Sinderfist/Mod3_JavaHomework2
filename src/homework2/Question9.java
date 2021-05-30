package homework2;

import java.util.HashSet;
import java.util.Iterator;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to iterate through all elements in a hash set.
		
//		Create a set of numbers to work with
		HashSet<Integer> arr = new HashSet<Integer>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		
//		Iterator is a collection in Java that allows you to iterate over a hashset without using a for loop
		Iterator<Integer> numbers = arr.iterator();
		
//		hasNext is a boolean value method that will detect the end of a hashSet without going over as long as the next
//		stays true
		while(numbers.hasNext()){
//			.next returns the next value in the array
			System.out.println(numbers.next());
		}			
		
	}

}
