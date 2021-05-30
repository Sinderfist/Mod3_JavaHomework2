package homework2;

import java.util.HashSet;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to test a hash set is empty or not
		
//		write and import a hashSet with nothing
		HashSet<Integer> hashMap = new HashSet<Integer>();
		
//		write a boolean variable that checks to see if the hashmap .isEmpty
		boolean check = hashMap.isEmpty();
		
//		write an if/else statement to check for those boolean values and return the result in the console
		if(check == true) {
			System.out.println("hashSet is empty");
		}
		else {
			System.out.println("hashSet is NOT empty");
		}
		
//		add variables to the hashSet
		hashMap.add(0);
		hashMap.add(1);
		hashMap.add(2);
		hashMap.add(3);
		hashMap.add(4);
		hashMap.add(5);
		
//		run a second check to see if the boolean returns the opposite of the first check due to changed parameters
		boolean check2 = hashMap.isEmpty();
		if(check2 == true) {
			System.out.println("hashSet is empty");
		}
		else {
			System.out.println("hashSet is NOT empty");
		}

	}

}
