package whiteboard.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import whiteboard.model.DShapeModel;

public class DRect extends DShape {

	public DRect(DShapeModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	/**
	 * draw a rectangle with the coordinates and dimensions within model
	 * set the color of the rectangle to the color within model
	 */
	@Override
	public void Draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		g2.fillRect(getX(), getY(), getWidth(), getHeight());
		g2.setColor(getColor());
	}

}
