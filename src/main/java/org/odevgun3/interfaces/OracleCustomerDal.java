package org.odevgun3.interfaces;

public class OracleCustomerDal implements CustomerDal, Repository{
    @Override
    public void add() {
        System.out.println("Added Oracle");
    }
}
