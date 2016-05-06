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
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(DShape shape : shapesList) {
			shape.Draw(g);
		}
	}

	public void addShape(DShapeModel model) {
		DShape shapeToAdd;
		if(model instanceof DOvalModel) {
			System.out.println("oval");
			shapeToAdd = new DOval(model);
			shapesList.add(shapeToAdd);
		}
		else if(model instanceof DRectModel) {
			System.out.println("rect");
			shapeToAdd = new DRect(model);
			shapesList.add(shapeToAdd);
			//oval.paint();
		}
	}

}
