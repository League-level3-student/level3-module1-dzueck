package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _02_GuestBook_classes.AddButton;
import _02_GuestBook_classes.ViewButton;

public class _02_GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public ArrayList<String> guests = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	AddButton aButton = new AddButton(this);
	JButton addButton = new JButton("Add Guest");
	JButton viewButton = new JButton("View Guests");
	
	
	public _02_GuestBook(){
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		viewButton.setLocation(0, 0);
		addButton.setLocation(0, 50);
		viewButton.setSize(100, 40);
		addButton.setSize(100, 40);
		viewButton.setVisible(true);
		addButton.setVisible(true);
		panel.add(viewButton);
		panel.add(addButton);
		addButton.addActionListener(new AddButton(this));
		viewButton.addActionListener(new ViewButton(this));

		while(true) {
			
		}
	}
	
	public void addGuest() {
		System.out.print("Please enter the guests name");
		guests.add(scanner.nextLine());
	}

	
	
	
	
}
