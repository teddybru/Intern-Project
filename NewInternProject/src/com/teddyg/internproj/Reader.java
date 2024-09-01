package com.teddyg.internproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Reader {

	ObjectMapper objectMapper = new ObjectMapper();
	private ArrayList<Values> tempArray = new ArrayList<Values>();
	{

	}

	@SuppressWarnings("unused")
	void readFile() {
//calling upon data file to be used in while loop
		try (FileReader reader = new FileReader(
				"C:\\Users\\Ultron\\Documents\\TeddyJava\\NewInternProject\\src\\1216225_WREN_NEIGHBOR_TABLE_20230302_171452.json");
				BufferedReader bufferedReader = new BufferedReader(reader);) {

			String currentLine;
			// using while loop to parse each line one by one, then is being temporarily
			// stored in arrayList
			while ((currentLine = bufferedReader.readLine()) != null) {
				Values v = objectMapper.readValue(currentLine, Values.class);
				tempArray.add(v);

				// indents each set of data, making it easier to read.


			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Parsing Completed");
	}

	public ArrayList<Values> getTempArray() {
		return tempArray;
	}

	public void setTempArray(ArrayList<Values> tempArray) {
		this.tempArray = tempArray;
	}

	@SuppressWarnings("unused")
	void sortFile() {

		// compares response time values and then sorts them based in ascending order
		Collections.sort(tempArray, new Comparator<Values>() {

			@Override
			public int compare(Values o1, Values o2) {
				return o1.getRespTime().compareTo(o2.getRespTime());
			}


		});
		System.out.println("Sorting Completed");
		// System.out.println(tempArray);
	}

}