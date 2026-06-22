package com.activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {

        try {
            // ✅ Step 1: Create file
            File file = new File("sample.txt");
            boolean fStatus = file.createNewFile();

            if (fStatus) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // ✅ Step 2: Write data to file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is sample data.\n");
            writer.write("Learning FileUtils operations in Java.");
            writer.close();

            // ✅ Step 3: Read data from file
            String data = FileUtils.readFileToString(file, "UTF8");
            System.out.println("Data in file: " + data);

            // ✅ Step 4: Create new directory
            File destDir = new File("destDir");
            if (!destDir.exists()) {
                destDir.mkdir();
                System.out.println("Directory created.");
            }

            // ✅ Step 5: Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
            System.out.println("File copied to directory.");

            // ✅ Step 6: Get file from new directory
            File newFile = FileUtils.getFile(destDir, "sample.txt");

            // ✅ Step 7: Read data from copied file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}