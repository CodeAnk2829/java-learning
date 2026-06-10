package lld.factorymethod.logger;

public class ErrorLogger implements ILogger {
    public void log() {
        System.out.println("Running error logger...");
    }
}
