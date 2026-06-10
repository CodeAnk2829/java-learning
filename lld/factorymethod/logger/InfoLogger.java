package lld.factorymethod.logger;

public class InfoLogger implements ILogger {
    public void log() {
        System.out.println("Running info logger...");
    }
}
