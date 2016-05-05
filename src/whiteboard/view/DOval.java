package whiteboard.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import whiteboard.model.DShapeModel;

public class DOval extends DShape {

	public DOval(DShapeModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		g2.drawOval(getX(), getY(), getWidth(), getHeight());
	}

}
