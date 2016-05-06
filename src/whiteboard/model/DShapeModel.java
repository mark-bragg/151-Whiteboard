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
	
	/**
	 * initialize each attribute
	 * set the attributes of point and rect to random numbers within the size of canvas
	 */
	public DShapeModel() {
		randomGenerator = new Random();
		color = Color.GRAY;
		point = new Point(randomGenerator.nextInt(400), randomGenerator.nextInt(400));
		rect = new Rectangle(getX(), getY(), randomGenerator.nextInt(400), randomGenerator.nextInt(400));
	}

	/**
	 * get the color
	 * @return color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * set this object's color to
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * return the x-coordinate location
	 * @return
	 */
	public int getX() {
		return point.x;
	}

	/**
	 * set the x-coordinate location of both point and rect
	 */
	public void setX(int x) {
		point.x = x;
		rect.x = x;
	}

	/**
	 * return the y-coordinate location
	 * @return
	 */
	public int getY() {
		return point.y;
	}

	/**
	 * set the y-coordinate location of both point and rect
	 */
	public void setY(int y) {
		point.y = y;
		rect.y = y;
	}

	/**
	 * get the width of the shape
	 * @return
	 */
	public int getWidth() {
		return rect.width;
	}

	/**
	 * set the width of the shape
	 * @return
	 */
	public void setWidth(int width) {
		rect.width = width;
	}

	/**
	 * get the height of the shape
	 * @return
	 */
	public int getHeight() {
		return rect.height;
	}

	/**
	 * set the height of the shape
	 * @return
	 */
	public void setHeight(int height) {
		rect.height = height;
	}
}
