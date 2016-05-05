package whiteboard.model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"X", "Y", "Width", "Height"};
	private ArrayList<ArrayList<Object>> data = new ArrayList<ArrayList<Object>>();
	
	public TableModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if(rowIndex >= getRowCount() || columnIndex >= getColumnCount())
			return null;
		return data.get(rowIndex).get(columnIndex);
	}
	
	public void setValueAt(Object value, int row, int col) {
		data.get(row).set(col,value);
		fireTableCellUpdated(row, col);
	}

}
