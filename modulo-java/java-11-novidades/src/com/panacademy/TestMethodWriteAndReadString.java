package com.panacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestMethodWriteAndReadString {
    public static void run() {
        Path filePath = Paths.get("/home/lucaslgr/projects/pan-academy/modulo-java/java-11-novidades/src/com/panacademy/", "temp", "test.txt");

        try
        {
            //Write content to file
            Files.writeString(filePath, "Hello World !!", StandardOpenOption.APPEND);

            //Verify file content
            String content = Files.readString(filePath);

            System.out.println(content);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
