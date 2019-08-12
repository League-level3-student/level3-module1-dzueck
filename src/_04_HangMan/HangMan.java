package _04_HangMan;

import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan{
	int numbWords;
	Scanner scanner = new Scanner(System.in);
	Stack<String> words = new Stack<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	HangMan(){
		frame.add(panel);
		frame.setSize(300,300);
		panel.add(label);
		frame.setVisible(true);
		do {
			System.out.println("How many words");
			numbWords = scanner.nextInt();
			if(numbWords < Utilities.getTotalWordsInFile("dictionary.txt")) {
				System.out.println("too big nerd");
			}
		} while(numbWords < Utilities.getTotalWordsInFile("dictionary.txt"));
		for(int i = 0; i < numbWords; i ++) {
			String newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if(words.contains(newWord)) {
				i--;
			}
			else {
				words.push(newWord);
			}
		}
		//label.setText(words.pop());
	}
	
}
