package com.panacademy;

public class Main {

    public static void main(String[] args) {
        //JAVA 11 - String.lines(str)
        TestMethodLines.run();

        //JAVA 11 - Files.writeString(path, string, StandardCharsets.UTF_8, options) and
        TestMethodWriteAndReadString.run();

        //JAVA 11 - String.isBlank()
        TestMethodStrIsBlank.run();

        //JAVA 11 - String.strip()
        TestMethodStrStrip.run();

        //JAVA 11 - String.repeat(int)
        TestMethodStrRepeat.run();
    }
}
