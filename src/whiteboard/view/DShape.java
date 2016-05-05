package whiteboard.view;

import java.awt.Graphics;

import whiteboard.model.*;

public abstract class DShape {

	private DShapeModel model;
	private String name;
	
	public DShape(DShapeModel model) {
		setName(this.getClass().getName());
		setModel(model);
	}
	
	public abstract void Draw(Graphics g);

	public DShapeModel getModel() {
		return model;
	}

	public void setModel(DShapeModel model) {
		this.model = model;
	}
	
	public int getX() {
		return model.getX();
	}
	
	public int getY() {
		return model.getY();
	}
	
	public int getWidth() {
		return model.getWidth();
	}
	
	public int getHeight() {
		return model.getHeight();
	}
	
	public void setX(int x) {
		model.setX(x);
	}
	
	public void setY(int y) {
		model.setY(y);
	}
	
	public void setWidth(int width) {
		model.setWidth(width);
	}
	
	public void setHeight(int height) {
		model.setHeight(height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
