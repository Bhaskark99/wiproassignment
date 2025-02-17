package com.wipro.in;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class Https {

	public static void main(String[] args) {
		
		        String urlString = "https://jsonplaceholder.typicode.com/posts/1";  // Example URL for a simple API request

		        try {
		            
		            URL url = new URL(urlString);

		            
		            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		          
		            connection.setRequestMethod("GET");

		            
		            System.out.println("Response Headers:");
		            for (Map.Entry<String, java.util.List<String>> entry : connection.getHeaderFields().entrySet()) {
		                System.out.println(entry.getKey() + ": " + entry.getValue());
		            }

		           
		            System.out.println("\nResponse Body:");
		            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
		                String inputLine;
		                StringBuilder responseBody = new StringBuilder();
		                while ((inputLine = in.readLine()) != null) {
		                    responseBody.append(inputLine);
		                }
		                System.out.println(responseBody.toString());
		            }

		            
		            connection.disconnect();

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		


	}


