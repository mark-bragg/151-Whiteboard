package whiteboard.controller;

import javax.swing.JFrame;

import whiteboard.view.WhiteboardFrame;


public class Whiteboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WhiteboardFrame frame = new WhiteboardFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
