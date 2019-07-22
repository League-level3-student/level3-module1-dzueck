package _02_GuestBook_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import _01_IntroToArrayLists._02_GuestBook;

public class ViewButton implements ActionListener{
	_02_GuestBook panel;
	
	ViewButton(_02_GuestBook panel){
		this.panel = panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < panel.guests.size(); i++) {
			System.out.println("Guest #" + i + ": " + panel.guests.get(i));
		}
	}

}
