package org.odevGun3nLayeredKodlamaio.core.logging;

public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("EmailLogger: " + message);
    }
}
