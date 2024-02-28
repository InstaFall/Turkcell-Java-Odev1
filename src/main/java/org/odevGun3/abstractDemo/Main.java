package org.odevGun3.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
        customerManager.getCustomer();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
