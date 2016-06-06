package whiteboard.view;

import java.awt.Graphics;
import java.awt.Rectangle;
import whiteboard.model.*;

public class DRect extends DShape {

	@Override
	void draw(Graphics g) {
		g.setColor(getModel().getColor());
		Rectangle pos = ((DRectModel)getModel()).getBounds();
		g.fillRect(pos.x, pos.y, pos.width, pos.height);
	}

}
