package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<>();

		//2. Add five Strings to your list
		strings.add("seven");
		strings.add("yes");
		strings.add("thats right");
		strings.add("no");
		strings.add("eight");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String s: strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i < strings.size(); i += 2) {
			System.out.println(strings.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i = strings.size() - 1; i >= strings.size(); i--) {
			System.out.println(strings.get(i));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s: strings) {
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
