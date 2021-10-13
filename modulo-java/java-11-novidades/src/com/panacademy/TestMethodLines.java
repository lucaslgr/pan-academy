package com.panacademy;

import java.util.stream.Stream;

public class TestMethodLines {
    public static void run() {
        System.out.println("Testando método str.lines()");
        String str = "A \n B \n C \n D";

        Stream<String> lines = str.lines();

        lines.forEach(System.out::println);
    }
}
