package org.odevGun3.abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data obtained from: MySql");
    }
}
