package com.panacademy;

public class TestMethodStrIsBlank {
    public static void run() {
        System.out.println("Testando metodos str.isBlank()");

        System.out.println( "ABC".isBlank() );          //false

        System.out.println( " ABC ".isBlank() );        //false

        System.out.println( "  ".isBlank() );           //true

        System.out.println( "".isBlank() );             //true
    }
}
