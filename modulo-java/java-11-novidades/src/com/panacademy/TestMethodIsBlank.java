package com.panacademy;

public class TestMethodIsBlank {
    public static void run() {
        System.out.println( "ABC".isBlank() );          //false

        System.out.println( " ABC ".isBlank() );        //false

        System.out.println( "  ".isBlank() );           //true

        System.out.println( "".isBlank() );             //true
    }
}
