package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

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

		CountDataFrequencies countFrequencies = new CountDataFrequencies();

		Map<String, Integer> treeMap = countFrequencies.countFrequencies(symptoms);


		WriteSymptomDataToFile writeInFile = new WriteSymptomDataToFile("result.out");

		writeInFile.writeData(treeMap);


	}
}
