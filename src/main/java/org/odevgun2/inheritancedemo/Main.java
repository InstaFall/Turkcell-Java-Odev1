package org.odevgun2.inheritancedemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new AgricultureCreditManager());
    }
}
