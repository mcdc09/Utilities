package com.bowling.utilities.databases;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bowling.utilities.lists.ListHelper;


public class DBTableCreator {
	private DatabaseOperator dbOp;
	private List<String> tableNames;
	
	public DBTableCreator(String file) {
		System.out.println("Read file: " + file);
		if(file.endsWith(".db")) {
			readDB(file);
		} else if(file.endsWith(".csv")) {
			readCSV(file);
		}
	}
	
	private void readCSV(String file) {
		
	}
	
	private void readDB(String file) {
		dbOp = new DatabaseOperator(file);
		List<String> tables = getTableNames();
		
		
	}
	
	public List<String> getTableNames() {
		List<String> out = new ArrayList<String>();
		
		try {
			DatabaseMetaData md = DatabaseOperator.getConnection().getMetaData();
			ResultSet rs = md.getTables(null, null, "%", null);
			while(rs.next()) {
				out.add(rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return out;
	}
	
	private Table readDBTable(String tableName) {
		Table out = new Table(tableName);
		
		
		return out;
	}
	
	public static void main(String[] args) {
		String file = "/Users/ducttapeboro/Documents/workspace_kepler/CX4230_ProjectTwo/res/data/AirportDB.db";
		DBTableCreator dbt = new DBTableCreator(file);
	}

}
