package whiteboard.view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.HeadlessException;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import whiteboard.model.TableModel;


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
		canvas = new Canvas();
		add(canvas, "Center");
		controlPanel = new ControlPanel(new BorderLayout());
		add(controlPanel, "West");
		table = new JTable(new TableModel());
		tablePane = new JScrollPane(table);
		controlPanel.add(tablePane, BorderLayout.PAGE_END);
		table.setFillsViewportHeight(true);
	}
	
	public void setCanvas() {
		
	}
	
	public void setControlPanel() {
		
		
	}
	
}
