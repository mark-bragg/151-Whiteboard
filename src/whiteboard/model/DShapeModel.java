package whiteboard.model;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class DShapeModel {

	private Color color;
	private Rectangle rect;
	private Point point;
	
	public DShapeModel() {
		color = Color.GRAY;
		rect = new Rectangle(0,0,0,0);
		point = new Point(0,0);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return point.x;
	}

	public void setX(int x) {
		point.x = x;
		rect.x = x;
	}

	public int getY() {
		return point.y;
	}

	public void setY(int y) {
		point.y = y;
		rect.y = y;
	}

	public int getWidth() {
		return rect.width;
	}

	public void setWidth(int width) {
		rect.width = width;
	}

	public int getHeight() {
		return rect.height;
	}

	public void setHeight(int height) {
		rect.height = height;
	}
}
