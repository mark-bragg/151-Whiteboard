package whiteboard.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;


import whiteboard.model.*;

public class Canvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<DShape> shapesList;
	private DShape selectedShape;

	public Canvas() {
		setSize(400, 400);
		setBackground(Color.WHITE);
		shapesList = new ArrayList<DShape>();
		setShapeSelection();
		
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
	
	public void setShapeSelection() {
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				for(int i = shapesList.size()-1; i >= 0; i--) {
					int[] bounds = shapesList.get(i).getBounds();
					System.out.println("shape coords: " + bounds[0] + " " + bounds[2] + " " + bounds[1] + " " + bounds[3]);
					System.out.println("mouse coords: " + x + " " + y);
					if(x >= bounds[0] && x <= bounds[2] && y >= bounds[1] && y <= bounds[3]) {
						selectedShape = shapesList.get(i);
						selectedShape.setColor(Color.BLUE);
						repaint();
						
						break;
					}
				}
				
			}
		});
	}

}
