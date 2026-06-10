package lld.factorymethod.logger;

abstract public class LoggerFactory {
    abstract ILogger createLogger();

    public void consoleLog() {
        ILogger logger = this.createLogger();
        logger.log();
    }
}
