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
		if(model instanceof DOvalModel) {
			shapesList.add(new DOval(model));
		}
		else if(model instanceof DRectModel) {
			shapesList.add(new DRect(model));
		}
	}

}
