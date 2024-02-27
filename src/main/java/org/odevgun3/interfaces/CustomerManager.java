package org.odevgun3.interfaces;

public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        System.out.println("Adding");
        customerDal.add();
    }
}
