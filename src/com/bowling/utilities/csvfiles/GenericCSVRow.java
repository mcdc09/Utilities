package com.bowling.utilities.csvfiles;

import java.util.Map;
import java.util.Set;

public class GenericCSVRow {
	private Map<String, String> row;
	private int lineCount;
	
	public GenericCSVRow(Map<String, String> r, int c) {
		this.row = r;
		this.lineCount = c;
	}
	
	public String[] getHeaders() {
		Set<String> keys = row.keySet();
		return (String[]) keys.toArray();
	}
	
	public String getColumn(String h) {
		return row.get(h);
	}

	/**
	 * @return the row
	 */
	public Map<String, String> getRow() {
		return row;
	}

	/**
	 * @return the lineCount
	 */
	public int getLineCount() {
		return lineCount;
	}

	/**
	 * @param lineCount the lineCount to set
	 */
	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(Map<String, String> row) {
		this.row = row;
	}
	
	

}
