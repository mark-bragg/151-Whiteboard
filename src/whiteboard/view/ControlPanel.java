package whiteboard.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * shape button section
	 */
	private JButton rect;
	private JButton oval;
	private JButton line;
	private JButton text;
	private Box shapeButtonBox;
	
	/**color setting button*/
	private Box setColorBox;
	private JButton setColor;
	
	public ControlPanel(LayoutManager layout) {
		super(layout);
		setBackground(Color.LIGHT_GRAY);
		setShapeButtons();
		setColorButton();
	}
	
	/**
	 * create each add shape button and add them to shapeButtonBox
	 * iterate over the Components in shapeButtonBox and align each of them to the left
	 * add shapeButtonBox to this at the north border
	 */
	private void setShapeButtons() {
		rect = new JButton("Rect");
		oval = new JButton("Oval");
		line = new JButton("Line");
		text = new JButton("Text");
		shapeButtonBox = new Box(BoxLayout.X_AXIS);
		shapeButtonBox.add(rect);
		shapeButtonBox.add(oval);
		shapeButtonBox.add(line);
		shapeButtonBox.add(text);
		for(Component comp : shapeButtonBox.getComponents()) {
			((JComponent)comp).setAlignmentX(Box.LEFT_ALIGNMENT);
		}
		add(shapeButtonBox, "North");
		shapeButtonBox.setVisible(true);
	}
	
	/**
	 * create a new ArrayList<JButton> named buttons
	 * iterate over shapeButtonBox and add each JButton Component to buttons
	 * @return buttons
	 */
	public ArrayList<JButton> getShapeButtons() {
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		for(Component comp : shapeButtonBox.getComponents()) {
			if((JComponent)comp instanceof JButton) {
				buttons.add((JButton) comp);
			}
		}
		
		return buttons;
	}
	
	/**
	 * create setColor JButton and add it to setColorBox
	 * iterate over the Components in setColorBox and align each of them to the left
	 */
	private void setColorButton() {
		setColor = new JButton("Set Color");
		setColorBox = new Box(BoxLayout.X_AXIS);
		setColorBox.setVisible(true);
		setColorBox.add(setColor);
		add(setColorBox);
		for(Component comp : setColorBox.getComponents()) {
			((JComponent)comp).setAlignmentX(Box.LEFT_ALIGNMENT);
		}
	}

	

}
