package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsCounter {

	/**
	 *
	 * @param args My name
	 * @throws Exception
	 */
	
	public static void main(String args[]) throws Exception {

		//Call obj readSymptom
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		//Call obj symptoms
		ArrayList<String> symptoms = readSymptom.getSymptoms();

		// Writing data in the file
		WriteDataToFile writeData = new WriteDataToFile("result.out");


		writeData.countFrequencies(symptoms);

	}
}
