package org.odevGun3.polymorphism;

public class DatabaseLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to Database: " + message);
    }
}
