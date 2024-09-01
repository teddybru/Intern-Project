package com.teddyg.internproj;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Writer {



	public void writeFile() {
		// importing reader class to get the values from tempArray
		Reader reader = new Reader();
		reader.readFile();
		ArrayList<Values> tempArray = reader.getTempArray();
		// creating new file to write ArrayList values into
		String filename = "parsedData.json";
		String workingDirectory = System.getProperty("user.dir");

		String absoluteFilePath = "";

		// absoluteFilePath = workingDirectory + System.getProperty("file.separator") +
		// filename;
		absoluteFilePath = workingDirectory + File.separator + filename;

		System.out.println("Final filepath : " + absoluteFilePath);

		File file = new File(absoluteFilePath);

		try {
			// formats array list into readable JSON format
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			// writing arrayList(variable tempArray) into new file(variable file)
			mapper.writeValue(file, tempArray);
		} catch (IOException e) {
		e.printStackTrace();
	}
	// displays in console that the writeFile method has successfully been completed
	System.out.println("Data Transfer Completed ");

}
}

