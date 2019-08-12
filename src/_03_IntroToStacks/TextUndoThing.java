package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoThing implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> undoStack = new Stack<String>();
	TextUndoThing(){
		
		frame.setSize(4000, 4000);
		frame.addKeyListener(this);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(label);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			undoStack.push(String.valueOf(label.getText().charAt(label.getText().length() - 1)));
			label.setText(label.getText().substring(0, label.getText().length() - 1));
		}
		else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if(undoStack.get(undoStack.size() - 1) == "added") {
				label.setText(label.getText().substring(0, label.getText().length() - 1));
			}
			else {
				label.setText(label.getText() + undoStack.get(undoStack.size() - 1));
			}
			undoStack.pop();
		}
		else {
			label.setText(label.getText() + e.getKeyChar());
			undoStack.push("added");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
