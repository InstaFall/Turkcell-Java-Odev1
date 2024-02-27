package org.odevgun3.abstractdemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data obtained from: MySql");
    }
}
