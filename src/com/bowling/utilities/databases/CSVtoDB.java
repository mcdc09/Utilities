package com.bowling.utilities.databases;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Application that allows the user to create a database from a CSV file.
 * @author tbowling3
 *
 */
public class CSVtoDB extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -439105720520628123L;
	private CSVReadPanel csvPanel;

	public CSVtoDB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setMinimumSize(new Dimension(600, 400));
		setTitle("CSV to Database");

		File file = getCSVFile();
		csvPanel = new CSVReadPanel(file);
		setContentPane(csvPanel);

	}

	private File getCSVFile() {
		File out = null;

		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"CSV files", "csv");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			out = chooser.getSelectedFile();
		}
		return out;
	} // close getCSVFile()

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSVtoDB frame = new CSVtoDB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				} // close catch
			} // close run
		});
	} // close main(...)

}
