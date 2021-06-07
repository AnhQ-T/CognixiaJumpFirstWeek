package com.cognixia.jump.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cognixia.jump.streams.Person;

public class ObjectStreams {

	public static void main(String[] args) {
		
		File file = new File("resources/objectFile.data");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		writeObjectToFile(file);
		readObjectToFile(file);
		
	}
	
	public static void writeObjectToFile(File file) {
		
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))) {
			Person person = new Person("Sam", 24);
			
			writer.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readObjectToFile(File file) {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
			
			Person person = (Person) reader.readObject();
			System.out.println("Our person from file: \n" + person);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
