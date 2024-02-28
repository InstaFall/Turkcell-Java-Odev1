package org.odevGun3nLayeredKodlamaio.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("FileLogger: " + message);
    }
}
