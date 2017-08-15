package com.HomeAssignment_Question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.LinkedList;

public class readFileAndPrint {
	public static void main(String[] args) {
		String filePath = (System.getProperty("user.dir")
				+ "/src\\com\\HomeAssignment_Question3\\Dictionary_Testdata.txt");
		doesFileExist(filePath);
		readFile(filePath);
	}

	public static void doesFileExist(String file_path) {
		File f = new File(file_path);
		if (f.exists() && f.isFile()) {
			System.out.println("File Exists!");
			// System.out.println();
		} else {
			System.out.println("Error: File does NOT exist!");
			// System.out.println();
		}
	}

	public static void readFile(String file_path) {
		try {

			// Open the file
			FileInputStream fstream = new FileInputStream(file_path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			// LinkedList<String> words = new LinkedList<>();

			// Read File Line By Line

			while ((strLine = br.readLine()) != null) {

				// split each line by " - " and print the word before and after " - " on a new
				// line
				for (String word : strLine.split(" - ")) {
					for (String wordAfterComma : word.split(", ")) {
						System.out.println(wordAfterComma);
					}
				}
			}

			// Close the input stream
			br.close();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}