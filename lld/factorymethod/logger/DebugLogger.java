package lld.factorymethod.logger;

public class DebugLogger implements ILogger {
    public void log() {
        System.out.println("Running debug logger...");
    }
}
