package main;

import javax.swing.JFrame;

/**
 * Main class of the game that handles all of the game functions
 * 
 * @author Jake Smithson
 *
 */
public class Game {

	/**
	 * Main method that handles all game functions
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Dragon Tale");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	}
	
}
