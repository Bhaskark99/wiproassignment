package com.wipro.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class JdbcAss {
	public static void main(String[] args) {
		
	
    String inputFilePath = "inputfile";
    String outputFilePath = "word_frequencies.txt";

    // Call the method to count word frequencies and write the results
    countWordFrequencies(inputFilePath, outputFilePath);
}

public static void countWordFrequencies(String inputFilePath, String outputFilePath) {
    // Map to store word frequencies
    Map<String, Integer> wordCountMap = new HashMap();
   
    
       
        try {
        	FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
			while ((line = bufferedReader.readLine()) != null) {
			   
			    String[] words = line.split("[\\W_]+"); 
			    for (String word : words) {
			        
			        if (!word.isEmpty()) {
			            word = word.toLowerCase();
			            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1); // Update the count in the map
			        }
			    }
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

       System.out.println(wordCountMap);
    

}

}