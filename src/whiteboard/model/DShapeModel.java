package whiteboard.model;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

public abstract class DShapeModel {
 
	private Color color;
	private Rectangle rect;
	private Point point;
	Random randomGenerator;
	
	public DShapeModel() {
		randomGenerator = new Random();
		color = Color.GRAY;
		point = new Point(randomGenerator.nextInt(400), randomGenerator.nextInt(400));
		rect = new Rectangle(getX(), getY(), randomGenerator.nextInt(400), randomGenerator.nextInt(400));
		System.out.println("Creating a new DShapeModel");
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
