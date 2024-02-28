package org.odevGun3.abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data obtained from: SqlServer");
    }
}
