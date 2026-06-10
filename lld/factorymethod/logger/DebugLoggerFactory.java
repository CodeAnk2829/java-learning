package lld.factorymethod.logger;

public class DebugLoggerFactory extends LoggerFactory {
    ILogger createLogger() {
        return new DebugLogger();
    }
}
