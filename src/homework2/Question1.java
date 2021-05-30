package homework2;

import java.util.ArrayList;

import java.util.Collections;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to copy one array list into another
		
		
//		Make and Array of words to be copied
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("These");
		list.add("words");
		list.add("get");
		list.add("copied");
		
		
//		Make an Array with placeholders to copy the list to
		ArrayList<String> copyList = new ArrayList<String>();
		
		copyList.add("replaced");
		copyList.add("replaced");
		copyList.add("replaced");
		copyList.add("replaced");
		
		
//		.copy is a collections method that replaces the words in the first parameter with 
//		the ones from the second parameter
		
		Collections.copy(copyList, list );
		System.out.println(copyList);
		
		
		
	}

}
