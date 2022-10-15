package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WriteDataToFile {

    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public WriteDataToFile (String filepath) {this.filepath = filepath;}

    public static Map<String, Integer> countFrequencies(ArrayList<String> symptoms)
    {


        // hashmap to store the frequency of element
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String i : symptoms) {
            Integer j = hashMap.get(i);
            hashMap.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist

        try (BufferedWriter fw = new BufferedWriter(new FileWriter("result.out"))) {

            for (Map.Entry<String, Integer> val : hashMap.entrySet()) {

                fw.write("Symptom " + val.getKey() + " " + ": " + val.getValue());

                fw.newLine();
                //System.out.println("Symptom " + val.getKey() + " " + ": " + val.getValue());

            }

            fw.flush();

        }
        catch (IOException e) {
            e.printStackTrace();
        }


        return hashMap;
    }
}
