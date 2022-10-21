package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public interface ISymptomWriter {
    /**
     *
     * @param treeMap
     * @return a map with all symptoms one per line
     */


    Map<String, Integer> writeData(Map<String, Integer> treeMap);
}
