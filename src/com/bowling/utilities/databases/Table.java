package com.bowling.utilities.databases;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private String tableName;
	private List<String> columns;
	private List<Row> rows;
	
	public Table(String tableName, List<String> col, List<Row> rows) {
		this.tableName = tableName;
		this.columns = col;
		this.rows = rows;
	}
	
	public Table(String tableName) {
		this(tableName, new ArrayList<String>(), new ArrayList<Row>());
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the columns
	 */
	public List<String> getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	/**
	 * @return the rows
	 */
	public List<Row> getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

}
