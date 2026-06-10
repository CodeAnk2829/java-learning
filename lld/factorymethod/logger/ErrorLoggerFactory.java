package lld.factorymethod.logger;

public class ErrorLoggerFactory extends LoggerFactory {
    ILogger createLogger() {
        return new ErrorLogger();
    }
}
