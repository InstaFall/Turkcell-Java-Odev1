package org.odevgun2.varargs;

public class Main {
    public static void main(String[] args) {
        findNumber();

        int number = add(3,5);
        System.out.println("The result of add() function: "+ number);

        int sum = addVarArgs(1,2,3,4,5);
        System.out.println("The result of addVarArgs() function: "+ sum);
    }

    public static void findNumber() {
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6};
        int numberToSearch = 6;
        boolean exists = false;

        for (int number : numbers) {
            if (numberToSearch == number) {
                exists = true;
                break;
            }
        }

        if (exists)
            printMsg("Number exists: " + numberToSearch);
        else
            printMsg("Number does not exists: " + numberToSearch);
    }

    public static void printMsg(String message) {
        System.out.println(message);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int addVarArgs(int... numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }
}