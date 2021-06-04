package com.cognixia.jump.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		// Java rep of our desired file
		File file = new File("resources/temp.txt");
		
		// does it already exist?
		System.out.println("Does this file exist? : " + file.exists());
		
		// if file does not exist, make it
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Created File successfully");
			} catch (IOException e) {
				System.out.println("Could not create file, see stack trace below");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// get some metadata about the file
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("File name: " + file.getName());
		System.out.println("Last modified: " + file.lastModified());
		
		File dir = new File("resources/dir1");
		
		if(!dir.exists()) {
			try {
				boolean created = dir.mkdir();;
				if (created) {
					System.out.println("Created Directory successfully");
				} else {
					System.out.println("Directory not created");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// Read a file
		
		try {
			readFile();
		} catch(FileNotFoundException e) {
			System.out.println("Could not find file");
		} catch (IOException e) {
			System.out.println("Unexpected IO issue");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readFile() throws IOException, FileNotFoundException, Exception {
		File file = new File("resources/temp.txt");
		FileReader fileReader = null;
		
		BufferedReader reader = null;
		
		fileReader = new FileReader(file);
		reader = new BufferedReader(fileReader);
		
		System.out.println("\nReading in temp.txt");
		System.out.println("----------------");
		
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		
		fileReader.close();
		reader.close();
	}

}
