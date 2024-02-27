package org.odevgun3.overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[] {
                new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager manager : creditManagers) {
            System.out.println(manager.calculate(1000));
        }
    }
}
