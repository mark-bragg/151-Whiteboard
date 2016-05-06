package whiteboard.controller;

import java.awt.BorderLayout;

import whiteboard.view.WhiteboardFrame;

public class MainController {
	
	private WhiteboardFrame whiteboard;
	
	public MainController() {
		whiteboard = new WhiteboardFrame("Whiteboard");
		whiteboard.setSize(800, 800);
		whiteboard.setVisible(true);
		whiteboard.setLayout(new BorderLayout());
	}

	public static void main(String[] args) {
		new MainController();
	}

}
