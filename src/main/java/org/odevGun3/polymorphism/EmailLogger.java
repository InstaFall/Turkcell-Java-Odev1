package org.odevGun3.polymorphism;

public class EmailLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to Email: "+message);
    }
}
