package org.odevGun3.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
    public void getCustomer() {
        databaseManager.getData();
    }
}
