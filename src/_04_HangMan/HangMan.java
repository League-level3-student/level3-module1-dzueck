package _04_HangMan;

import java.util.ArrayList;
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
	ArrayList<Character> guessed = new ArrayList<>();
	int lives = 8;
	String currentWord;
	String changingWord;
	
	HangMan(){
		frame.add(panel);
		frame.setSize(300,300);
		panel.add(label);
		frame.setVisible(true);
		do {
			System.out.println("How many words");
			numbWords = scanner.nextInt();
			if(numbWords > Utilities.getTotalWordsInFile("dictionary.txt")) {
				System.out.println("too big nerd");
			}
		} while(numbWords > Utilities.getTotalWordsInFile("dictionary.txt"));
		for(int i = 0; i < numbWords; i ++) {
			String newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if(words.contains(newWord)) {
				i--;
			}
			else {
				words.push(newWord);
			}
		}
		scanner.nextLine();
		while(words.size() > 0) {
			startNewWord();
			System.out.println(currentWord);
			while(changingWord.length() > 0 && lives > 0) {
				System.out.println(changingWord);
				char guessedLetter = askForLetter();
				if(changingWord.contains(guessedLetter + "")) {
					for(int i = 0; i < currentWord.length(); i ++) {
						if(currentWord.charAt(i) == guessedLetter) {
							if(i == 0) {
								label.setText(guessedLetter + label.getText().substring(1));
							}
							else {
								label.setText(label.getText().substring(0,((i + 1) * 2 - 1) - 1) + guessedLetter + " " + label.getText().substring((i * 2 - 1) + 3));
							}
						}
					}
					changingWord = changingWord.replaceAll(guessedLetter + "", "");
				}
				else {
					lives--;
					label.setText(label.getText().substring(0, label.getText().length()-1) + lives);
				}
				
			}
			if(changingWord.length() == 0) {
				System.out.println("You win");
			}
			else if(lives == 0) {
				System.out.println("You failed");
				if(!askPlayAgain()) {
					break;
				}
				else {
					restart();
				}
			}
		}
	}
	
	private void startNewWord() {
		guessed.clear();
		lives = 8;
		currentWord = words.pop();
		changingWord = currentWord;
		label.setText("");
		for(int i = 0; i < currentWord.length(); i ++) {
			label.setText(label.getText() + "_ ");
		}
		label.setText(label.getText() + "| Lives: " + lives);
	}
	
	private char askForLetter() {
		while(true) {
			System.out.println("guess a letter");
			String input = scanner.nextLine();
			if(guessed.contains(input.toCharArray()[0])) {
				System.out.println("Already guessed that one try again.");
			}
			else if(input.length() == 1) {
				guessed.add(input.toCharArray()[0]);
				return input.toCharArray()[0];
			}
			else {
				System.out.println("Stop trying to break my code. Try again");
			}
		}
	}
	
	private boolean askPlayAgain() {
		while(true) {
			System.out.println("Play again?");
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("yes")) {
				return true;
			}
			else if(input.equalsIgnoreCase("no")) {
				return false;
			}
			else {
				System.out.println("Stop trying to break my code. Try again");
			}
		}
	}

	private void restart() {
		words.clear();
		do {
			System.out.println("How many words");
			numbWords = scanner.nextInt();
			if(numbWords > Utilities.getTotalWordsInFile("dictionary.txt")) {
				System.out.println("too big nerd");
			}
		} while(numbWords > Utilities.getTotalWordsInFile("dictionary.txt"));
		for(int i = 0; i < numbWords; i ++) {
			String newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if(words.contains(newWord)) {
				i--;
			}
			else {
				words.push(newWord);
			}
		}
	}
	
}
