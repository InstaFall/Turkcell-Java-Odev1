package org.odevgun3.abstractdemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data obtained from: SqlServer");
    }
}
