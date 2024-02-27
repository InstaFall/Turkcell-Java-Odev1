package org.odev2;

public class Main {
    public static void main(String[] args) {
        findNumber();
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6};
        int numToSearch = 6;
        boolean exists = false;

        for (int number : numbers) {
            if (numToSearch == number) {
                exists = true;
                break;
            }
        }

        if (exists)
            printMsg("Number exists: " + numToSearch);
        else
            printMsg("Number does not exists: " + numToSearch);
    }

    public static void printMsg(String message) {
        System.out.println(message);
    }
}