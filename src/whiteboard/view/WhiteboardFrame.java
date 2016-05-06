package whiteboard.view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import whiteboard.model.*;


public class WhiteboardFrame extends Frame {

	/**
	 * The GUI frame that that the user will interact with
	 * contains:
	 * 	Canvas in the center
	 * 	ControlPanel to the west
	 * 		ControlPanel contains the tablePane which contains the table
	 */
	private static final long serialVersionUID = 1L;
	private Canvas canvas;
	private ControlPanel controlPanel;
	private JScrollPane tablePane;
	private JTable table;
	

	public WhiteboardFrame(String title) throws HeadlessException {
		super(title);
		setResizable(false);
		setCanvas();
		setControlPanel();
	}
	
	/**
	 * create the Canvas, and add it to this
	 */
	public void setCanvas() {
		canvas = new Canvas();
		add(canvas, "Center");
	}
	
	/**
	 * create controlPanel and add it to this
	 * create table with a new TableModel and add it to tablePane
	 * add tablePane to controlPanel
	 * set the action for the shape buttons inside of controlPanel by getting the shapeButtons,
	 * 	iterating over them, and calling setAction() on each one
	 */
	public void setControlPanel() {
		
		controlPanel = new ControlPanel(new BorderLayout());
		
		add(controlPanel, "West");
		table = new JTable(new TableModel());
		
		tablePane = new JScrollPane(table);
		
		controlPanel.add(tablePane, BorderLayout.PAGE_END);
		table.setFillsViewportHeight(true);
		for(JButton button : controlPanel.getShapeButtons()) {
			if(button.getText().equals("Rect"))
				setAction(button, "Rect");
			if(button.getText().equals("Oval"))
				setAction(button, "Oval");
		}
	}
	
	/**
	 * add an action listener to the button being passed in
	 * action listener calls addShape() on canvas
	 * @param button to have the shape drawing action added to
	 * @param name of the shape to be associated with the button
	 */
	public void setAction(JButton button, final String name) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(name.equals("Rect"))
					canvas.addShape(new DRectModel());
				if(name.equals("Oval"))
					canvas.addShape(new DOvalModel());
				canvas.repaint();
			}
		});
	}
	
	
	
}
