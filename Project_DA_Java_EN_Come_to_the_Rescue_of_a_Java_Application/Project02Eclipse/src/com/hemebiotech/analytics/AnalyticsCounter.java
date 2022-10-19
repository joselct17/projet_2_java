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
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		//
		ArrayList<String> symptoms = readSymptom.GetSymptoms();

		WriteDataToFile writeData = new WriteDataToFile("result.out");


		Map<String, Integer> data = writeData.countFrequencies(symptoms);

	}
}
