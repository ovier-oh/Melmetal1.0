package com.smapp.fileapp.service;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class FileProcessor {
    public File process(File inputFile) throws IOException {
        File outputFile = new File("processed_" + inputFile.getName());
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
        }
        return outputFile;
    }
}
