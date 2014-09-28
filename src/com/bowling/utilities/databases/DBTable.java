package com.bowling.utilities.databases;

import java.util.ArrayList;
import java.util.List;

public class DBTable {
	private String DBname;
	private List<Table> tables;
	
	public DBTable(String dbName) {
		this.DBname = dbName;
		tables = new ArrayList<Table>();
	}
	
	public void addTable(Table t) {
		tables.add(t);
	}

}
