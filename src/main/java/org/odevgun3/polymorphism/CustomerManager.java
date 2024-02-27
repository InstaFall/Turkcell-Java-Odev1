package org.odevgun3.polymorphism;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add() {
        System.out.println("Adding customer");
        this.logger.log("Added customer!");
    }
}
