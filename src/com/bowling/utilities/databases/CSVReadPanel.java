package com.bowling.utilities.databases;

import java.io.File;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class CSVReadPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5581355079556042868L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CSVReadPanel(File file) {
		System.out.println(file);
		
		table = new JTable(createCSVTable());
		add(table);

	}
	
	private TableModel createCSVTable() {
		return null;
	}

}
