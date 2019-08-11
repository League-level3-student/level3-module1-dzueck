package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class _06_IPodShuffle implements ActionListener{
	ArrayList<Song> defenetlyDifferentSongs = new ArrayList<>();

	public _06_IPodShuffle() {
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JPanel panel = new JPanel();
		JButton button = new JButton("play a \"random\" song");
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		
		// 1. Use the Song class the play the demo.mp3 file.
			
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		defenetlyDifferentSongs.add(new Song("demo copy 2.mp3"));
		defenetlyDifferentSongs.add(new Song("demo copy 3.mp3"));
		defenetlyDifferentSongs.add(new Song("demo copy 4.mp3"));
		defenetlyDifferentSongs.add(new Song("demo copy 5.mp3"));
		defenetlyDifferentSongs.add(new Song("demo copy 6.mp3"));
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
	
	private void playRandomSong() {
		Random random = new Random();
		int number = random.nextInt(defenetlyDifferentSongs.size());
		defenetlyDifferentSongs.get(number).play();
		System.out.println(number);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		playRandomSong();
		
	}
}