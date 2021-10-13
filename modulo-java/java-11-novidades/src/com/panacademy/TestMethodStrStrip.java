package com.panacademy;

public class TestMethodStrStrip {
    public static void run() {

        System.out.println("Usando strip, stripLeading e stripTailing");
        String str = "  Hello World !!   ";
        System.out.println( str.strip() );          //"Hello World !!"
        System.out.println( str.stripLeading() );   //"Hello World !!   "
        System.out.println( str.stripTrailing() );  //"  Hello World !!"
    }
}
