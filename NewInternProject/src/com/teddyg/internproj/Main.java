
package com.teddyg.internproj;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

/**
 * Main class parses .json values into java objects line by line using Values
 * class, then writes parsed values to new file sorted by response time in
 * ascending order
 *
 */

public class Main {

	public static void main(String[] args)
			throws StreamReadException, DatabindException, IOException, FileNotFoundException {
		// Initializing reader and writer variables to call upon methods in Reader and
		// Writer class
		Reader reader = new Reader();
		Writer writer = new Writer();
		// calling upon .readFile() method to parse the data
		// reader.readFile();
		// .sortFile() sorts parsed data in ascending order by respTime variable found
		// in the Values.java class
		reader.sortFile();
		// .writeFile() writes parsed data into an empty .json file
		writer.writeFile();

	}
}




