package org.logging;


import java.io.IOException;
import java.util.logging.*;

public class OpenWeatherLogger {
    private static final String fileLocation = "src/test/java/org/resources/log_file.log";
    private static boolean loggerExists = false;
    private static final Logger logger = Logger.getLogger("myLogger");

    public static void createLogger(Level ConsolePrintoutLevel){
        loggerExists = true;
        logger.setUseParentHandlers(false);
        try {
            Handler fileHandler = new FileHandler(fileLocation, true);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new LogFormat());
            logger.log(Level.INFO, "Logger Created");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(ConsolePrintoutLevel);
        logger.addHandler(consoleHandler);
        System.out.println("initialised logger");
    }
    public static void writeLog(Level level, String message){
        if (loggerExists){
        logger.setLevel(level);
        logger.log(level, message);
        }
    }

    public static boolean doesLoggerExist() {
        return loggerExists;
    }
}
