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
	
	public void setCanvas() {
		canvas = new Canvas();
		add(canvas, "Center");
	}
	
	public void setAction(JButton button, final String name) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("what!");
				if(name.equals("Rect"))
					canvas.addShape(new DRectModel());
				if(name.equals("Oval"))
					canvas.addShape(new DOvalModel());
				canvas.repaint();
			}
		});
	}
	
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
	
}
