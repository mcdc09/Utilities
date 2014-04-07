package edu.gatech.cx4230.projectone.backend.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Reads in a CSV file
 * @author tbowling3
 *
 */
public class CSVReader {
	private ArrayList<GenericCSVRow> rows;
	private int ROW_LIMIT = 1000;

	public CSVReader(String filename) {
		rows = new ArrayList<GenericCSVRow>();
		FileHelper fh = new FileHelper();
		if(fh.fileExists(filename)) {
			BufferedReader br = null;
			String line = "";
			int lineCount = 0;
			String csvSplitBy = ",";
			String[] headers = new String[5];
			try {

				br = new BufferedReader(new FileReader(filename));
				while ((line = br.readLine()) != null) {

					// use comma as separator
					String[] lineSplit = line.split(csvSplitBy);
					// Get values from lineSplit array
					if(lineCount == 0) {
						headers = lineSplit;
					} else if(lineCount != 0 && lineCount < ROW_LIMIT) { // Ignore the Header row
						Map<String, String> rowData = new HashMap<String,String>();
						
						for(int i = 0; i < lineSplit.length; i++) {
							String head = headers[i];
							String data = lineSplit[i];
							rowData.put(head, data);
						}

						GenericCSVRow r = new GenericCSVRow(rowData, lineCount);
						rows.add(r);
					}
					lineCount++;

				} // close while

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	} // close constructor

	public ArrayList<GenericCSVRow> getRows() {
		return rows;
	}


}
