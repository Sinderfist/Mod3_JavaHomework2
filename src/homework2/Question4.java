package homework2;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to test an array list is empty or not
		
//		create an empty array list
		ArrayList<String> arr = new ArrayList<String>(1);
		
//		.isEmpty is a method in java that checks if arrays are empty
//		it is a boolean that is true or false 
		
//		first check is with an empty array to see if it will return true or false based on the parameters
		boolean check = arr.isEmpty();
		
		if (check == true) {
			System.out.println("The Array is Empty");
		}
		else {
			System.out.println("The array has elements in it");
		}
		
		
//		now we add an element to the array and check it again to see if it has registered our new element
//		and will hit the else statement
		arr.add("There are words now");
		
		boolean check2 = arr.isEmpty();
		if (check2 == true) {
			System.out.println("The Array is Empty");
		}
		else {
			System.out.println("The array has elements in it " + arr);
		}
	}

}
