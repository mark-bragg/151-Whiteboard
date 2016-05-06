package whiteboard.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import whiteboard.model.DShapeModel;

public class DOval extends DShape {

	public DOval(DShapeModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	/**
	 * draw an oval with the coordinates and dimensions within model
	 * set the color of the oval to the color within model
	 */
	@Override
	public void Draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getColor());
		g2.fillOval(getX(), getY(), getWidth(), getHeight());
		
	}

}
