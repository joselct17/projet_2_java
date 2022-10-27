package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {

	/**
	 *
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String args[]) throws Exception {


		//Call obj readSymptom
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("");

		//Call obj symptoms
		ArrayList<String> symptoms = readSymptom.getSymptoms();

		// Counting the frequencies

		CountDataFrequencies countSymptoms= new CountDataFrequencies();

		Map<String, Integer> treeMap = countSymptoms.countFrequencies(symptoms);

		// Writing in the file
		WriteSymptomDataToFile writeSymptoms = new WriteSymptomDataToFile("result.out");

		writeSymptoms.writeData(treeMap);


	}
}
