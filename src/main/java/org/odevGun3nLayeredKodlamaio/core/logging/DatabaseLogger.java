package org.odevGun3nLayeredKodlamaio.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("DatabaseLogger: " + message);
    }
}
