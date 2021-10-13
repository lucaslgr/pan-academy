package com.panacademy;

public class TestMethodStrip {
    public static void run() {
        String str = "  Hello World !!   ";

        System.out.println( str.strip() );          //"Hello World !!"

        System.out.println( str.stripLeading() );   //"Hello World !!   "

        System.out.println( str.stripTrailing() );  //"  Hello World !!"
    }
}
