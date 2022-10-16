package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		ArrayList<String> symptoms = readSymptom.GetSymptoms();

		//System.out.println(symptoms);

		WriteDataToFile writeData = new WriteDataToFile("result.out");


		Map<String, Integer> data = writeData.countFrequencies(symptoms);

	}
}
