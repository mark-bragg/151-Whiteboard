package whiteboard.view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;


public class WhiteboardFrame extends Frame {

	/**
	 * The GUI frame that that the user will interact with
	 */
	private static final long serialVersionUID = 1L;
	private Canvas canvas;
	private ControlPanel controlPanel;
	

	public WhiteboardFrame(String title) throws HeadlessException {
		super(title);
		setResizable(false);
		canvas = new Canvas();
		add(canvas, "Center");
		controlPanel = new ControlPanel(new GridLayout(5, 1));
		add(controlPanel, "West");
	}
	
	public void setCanvas() {
		
	}
	
	public void setControlPanel() {
		
		
	}
	
}
