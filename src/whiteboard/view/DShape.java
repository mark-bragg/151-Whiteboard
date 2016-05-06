package whiteboard.view;

import java.awt.Color;
import java.awt.Graphics;

import whiteboard.model.*;

public abstract class DShape {

	private DShapeModel model;
	private String name;
	
	public DShape(DShapeModel model) {
		setName(this.getClass().getName());
		setModel(model);
	}
	
	/**
	 * draw the shape
	 * @param g
	 */
	public abstract void Draw(Graphics g);

	/**
	 * get this object's DShapeModel
	 * @return model
	 */
	public DShapeModel getModel() {
		return model;
	}

	/**
	 * set this object's DShapeModel
	 * @param model
	 */
	public void setModel(DShapeModel model) {
		this.model = model;
	}
	
	/**
	 * get the Color of this object's shape
	 * @return the Color contained within model
	 */
	public Color getColor() {
		return model.getColor();
	}
	
	/**
	 * get the x-coordinate location of this object's shape 
	 * @return the x-coordinate within model
	 */
	public int getX() {
		return model.getX();
	}
	
	/**
	 * get the y-coordinate location of this object's shape
	 * @return the y-coordinate within model
	 */
	public int getY() {
		return model.getY();
	}
	
	/**
	 * get the width of this object's shape
	 * @return the width value within model
	 */
	public int getWidth() {
		return model.getWidth();
	}
	
	/**
	 * get the height of this object's shape
	 * @return the height value within model
	 */
	public int getHeight() {
		return model.getHeight();
	}
	
	/**
	 * set the x-coordinate location of this object's shape
	 */
	public void setX(int x) {
		model.setX(x);
	}
	
	/**
	 * set the y-coordinate location of this object's shape 
	 */
	public void setY(int y) {
		model.setY(y);
	}
	
	/**
	 * set the width of this object's shape 
	 */
	public void setWidth(int width) {
		model.setWidth(width);
	}
	
	/**
	 * set the height of this object's shape
	 */
	public void setHeight(int height) {
		model.setHeight(height);
	}

	/**
	 * get the name of the object
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the name of this object
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
