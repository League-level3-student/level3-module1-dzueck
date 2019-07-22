package _02_GuestBook_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import _01_IntroToArrayLists._02_GuestBook;

public class AddButton implements ActionListener{
	_02_GuestBook panel;
	
	public AddButton(_02_GuestBook _02_GuestBook){
		this.panel = _02_GuestBook;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.addGuest();
		
	}

}
