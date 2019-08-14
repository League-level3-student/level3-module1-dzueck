package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AddEntry implements ActionListener {
	_02_LogSearch thing;
	public AddEntry(_02_LogSearch things){
		thing = things;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Give the ID");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Give the name");
		String name = scanner.nextLine();

		thing.map.put(id, name);
	}
}