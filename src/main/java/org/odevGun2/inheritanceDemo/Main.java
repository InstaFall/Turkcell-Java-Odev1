package org.odevGun2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new AgricultureCreditManager());
    }
}
