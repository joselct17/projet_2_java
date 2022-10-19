package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteDataToFile {


    private static String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */

    public WriteDataToFile (String filepath) {this.filepath = filepath;}


    public static Map<String, Integer> countFrequencies(ArrayList<String> symptoms)
    {


        // treeMap to store the frequency of elements in alphabetical order
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);



        if (symptoms!= null) {
            for (String i : symptoms) {
                Integer j = treeMap.get(i);
                treeMap.put(i, (j == null) ? 1 : j + 1);
            }
        }

        // displaying the occurrence of elements in the arraylist
        if (filepath != null ) {
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filepath))) {

                for (Map.Entry<String, Integer> val : treeMap.entrySet()) {

                    fileWriter.write("Symptom " + val.getKey() + " " + ": " + val.getValue());

                    fileWriter.newLine();
                }

                fileWriter.close();

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return treeMap;
    }
}
