package org.odevGun3.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
