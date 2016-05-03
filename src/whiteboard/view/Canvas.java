package whiteboard.view;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Canvas() {
		
		setSize(400, 400);
		
		setBackground(Color.WHITE);
	}

	public Canvas(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Canvas(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Canvas(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
