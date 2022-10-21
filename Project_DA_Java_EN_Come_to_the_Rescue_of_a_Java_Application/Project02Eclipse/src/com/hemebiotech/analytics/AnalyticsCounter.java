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

		CountDataFrequencies countSymptoms= new CountDataFrequencies();

		Map<String, Integer> treeMap = countSymptoms.countFrequencies(symptoms);


		WriteSymptomDataToFile writeSymptoms = new WriteSymptomDataToFile("result.out");

		writeSymptoms.writeData(treeMap);


	}
}
