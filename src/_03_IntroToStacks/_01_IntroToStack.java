package _03_IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 100; i++) {
			doubles.push(random.nextDouble() * 100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		System.out.print("NUM 1: ");
		int numb1 = scanner.nextInt();
		System.out.print("\nNUM 2: ");
		int numb2 = scanner.nextInt();

		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		if(numb1 > numb2) {
			for(int i = 0; i < doubles.size(); i++) {
				if(doubles.get(i) < numb1 && doubles.get(i) > numb2) {
					System.out.println(doubles.get(i) + " poped");
					doubles.remove(i);
					i--;
				}
			}
		}
		else {
			for(int i = 0; i < doubles.size(); i++) {
				if(doubles.get(i) > numb1 && doubles.get(i) < numb2) {
					System.out.println(doubles.get(i) + " poped");
					doubles.remove(i);
					i--;
				}
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
