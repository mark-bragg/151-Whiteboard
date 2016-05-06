package whiteboard.controller;

import java.awt.BorderLayout;

import whiteboard.view.WhiteboardFrame;

public class MainController {
	
	/**
	 * contains the WhiteboardFrame for the GUI
	 */
	
	private WhiteboardFrame whiteboard;
	
	/**
	 * instantiate whiteboard
	 * set its size, visibility, and layout
	 */
	public MainController() {
		whiteboard = new WhiteboardFrame("Whiteboard");
		whiteboard.setSize(1000, 800);
		whiteboard.setVisible(true);
		whiteboard.setLayout(new BorderLayout());
	}

	/**
	 * main function
	 * instantiate a MainController object to start app
	 * @param args
	 */
	public static void main(String[] args) {
		new MainController();
	}

}
