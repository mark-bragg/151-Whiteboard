package whiteboard.controller;

import java.awt.BorderLayout;

import whiteboard.view.WhiteboardFrame;

public class MainStandAlone {

	public static void main(String[] args) {
		WhiteboardFrame whiteboard = new WhiteboardFrame("Whiteboard");
		whiteboard.setSize(800, 800);
		whiteboard.setVisible(true);
		whiteboard.setLayout(new BorderLayout());
		System.out.println("new line");
	}

}
