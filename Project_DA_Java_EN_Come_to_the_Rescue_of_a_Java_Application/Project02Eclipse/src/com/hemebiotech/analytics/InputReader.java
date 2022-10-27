package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

    public static String filePath() throws IOException {

        InputStreamReader inputReader = new InputStreamReader(System.in);

        BufferedReader pathReader = new BufferedReader (inputReader);

        System.out.println("Write your filepath in :");

        String path = pathReader.readLine();

        return path;
    }

}
