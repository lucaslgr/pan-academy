package com.panacademy;

class B {

}

class A {
    public B b;
}

public class TestNullPointerException {
    public static void run() {
        System.out.println("Testando NullPointerException do Java 14");
        try {
            A a = new A();
            a.b.c = 99;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
