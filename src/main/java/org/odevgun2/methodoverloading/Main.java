package org.odevgun2.methodoverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(3,5,8));

    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
