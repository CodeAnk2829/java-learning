package lld.factorymethod.client;

import lld.factorymethod.logger.DebugLoggerFactory;
import lld.factorymethod.logger.ErrorLoggerFactory;
import lld.factorymethod.logger.InfoLoggerFactory;
import lld.factorymethod.logger.LoggerFactory;

public class LoggerManager {
    private String logLevel;
    private LoggerFactory lFactory;

    public LoggerManager(String logLevel) {
        this.logLevel = logLevel;
    }

    public void displayLogs() {
        switch (logLevel) {
            case "debug":
                this.lFactory = new DebugLoggerFactory();
                this.lFactory.consoleLog();
                break;
            
            case "error": 
                this.lFactory = new ErrorLoggerFactory();
                this.lFactory.consoleLog();
                break;

            case "info": 
                this.lFactory = new InfoLoggerFactory();
                this.lFactory.consoleLog();
                break;

            default:
                System.out.println("Invalid log level");
                break;
        }
    }
}
