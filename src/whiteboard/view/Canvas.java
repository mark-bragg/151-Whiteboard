package whiteboard.view;

import java.awt.Color;
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

	public void addShape(DShapeModel model) {
		DShape shapeToAdd;
		if(model instanceof DOvalModel) {
			shapeToAdd = new DOval(model);
			shapesList.add(shapeToAdd);
			//oval.paint();
		}
		else if(model instanceof DRectModel) {
			shapeToAdd = new DRect(model);
			shapesList.add(shapeToAdd);
			//oval.paint();
		}
	}

}
