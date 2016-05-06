package whiteboard.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


import whiteboard.model.*;

public class Canvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<DShape> shapesList;

	public Canvas() {
		setSize(400, 400);
		setBackground(Color.WHITE);
		shapesList = new ArrayList<DShape>();
	}
	
	/**
	 * iterate over shapesList and calls Draw() on each shape
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(DShape shape : shapesList) {
			shape.Draw(g);
		}
	}

	/**
	 * add a shape to shapesList
	 * @param model is determined to be a certain DShapeModel subclass
	 * 	for whatever subclass it is, create a DShape of same shape type
	 */
	public void addShape(DShapeModel model) {
		if(model instanceof DOvalModel) {
			shapesList.add(new DOval(model));
		}
		else if(model instanceof DRectModel) {
			shapesList.add(new DRect(model));
		}
	}

}
