package org.odevGun2.classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();


        //Reference type - Value type exercise
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println("number2: " + number2);

        int []numbers1 = new int[] {1,2,3};
        int []numbers2 = new int[] {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println("numbers2[0]: " + numbers2[0]);

    }
}
