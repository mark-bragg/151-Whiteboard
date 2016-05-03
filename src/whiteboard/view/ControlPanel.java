package whiteboard.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ControlPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * shape button section
	 */
	JTextArea add;
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
	
	private void setShapeButtons() {
		add = new JTextArea("add");
		add.setBackground(Color.LIGHT_GRAY);
		add.setEditable(false);
		rect = new JButton("Rect");
		oval = new JButton("Oval");
		line = new JButton("Line");
		text = new JButton("Text");
		shapeButtonBox = new Box(BoxLayout.X_AXIS);
		shapeButtonBox.setMaximumSize(new Dimension(0, 0));
		shapeButtonBox.add(add);
		shapeButtonBox.add(rect);
		shapeButtonBox.add(oval);
		shapeButtonBox.add(line);
		shapeButtonBox.add(text);
		add(shapeButtonBox);
		shapeButtonBox.setVisible(true);
		for(Component comp : shapeButtonBox.getComponents()) {
			((JComponent)comp).setAlignmentX(Box.LEFT_ALIGNMENT);
		}
	}
	
	private void setColorButton() {
		setColorBox = new Box(BoxLayout.X_AXIS);
		setColorBox.setVisible(true);
		setColor = new JButton("Set Color");
		setColorBox.add(setColor);
		add(setColorBox);
		for(Component comp : setColorBox.getComponents()) {
			((JComponent)comp).setAlignmentX(Box.LEFT_ALIGNMENT);
		}
	}

	

	public ControlPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public ControlPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
