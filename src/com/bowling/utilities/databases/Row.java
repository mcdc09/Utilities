package com.bowling.utilities.databases;

import java.util.HashMap;
import java.util.Map;

public class Row {
	private Map<String, String> rowData;
	private int line;
	private int colCount;
	
	public Row(int line) {
		this.line = line;
		rowData = new HashMap<String, String>();
		colCount = 0;
	}
	
	public int addData(String colName, String data) {
		rowData.put(colName, data);
		colCount++;
		return colCount;
	}
	
	

}
