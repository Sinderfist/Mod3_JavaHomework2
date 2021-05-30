package homework2;

import java.util.HashSet;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to convert a hash set to an array.
		
//		Create hashSet
		HashSet<String> arr = new HashSet<String>();
		
//		add elements
		arr.add("New");
		arr.add("Words");
		arr.add("Go");
		arr.add("In");
		arr.add("Here");
		
		
//		create an Array
		String[] newArr = new String[arr.size()];
		
//		assign the hashmap to the new array
		arr.toArray(newArr);
		
//		for each string in the new array assign it a new variable of word and then display that word on the console
		for(String word: newArr) {
			System.out.println(word);
		}
	}

}
