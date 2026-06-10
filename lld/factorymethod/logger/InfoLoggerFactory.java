package lld.factorymethod.logger;

public class InfoLoggerFactory extends LoggerFactory {
    ILogger createLogger() {
        return new InfoLogger();
    }
}
