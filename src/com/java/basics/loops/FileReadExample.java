package com.java.basics.loops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

    public static void main(String[] args) {
        String filePath = "resources/config.txt"; // example config file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line (e.g., load config settings)
                System.out.println("Config line: " + line);
            }
        } catch (IOException e) {
            // Log exception in real-world apps
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
