package org.odevgun3.abstractdemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
    public void getCustomer() {
        databaseManager.getData();
    }
}
