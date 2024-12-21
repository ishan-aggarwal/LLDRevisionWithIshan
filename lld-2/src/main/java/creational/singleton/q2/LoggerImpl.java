package creational.singleton.q2;

import org.springframework.boot.logging.LogLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerImpl implements Logger {

    private static volatile Logger instance = null;
    private String logFilePath;
    private PrintWriter logWriter;

    private LoggerImpl() {
        // Private constructor to prevent external instantiation
    }

    public static synchronized Logger getInstance() {

        if (instance == null) {
            synchronized (LoggerImpl.class) {
                if (instance == null) {
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (logWriter == null) {
            throw new IllegalStateException("Log file not set. Call setLogFile() before logging.");
        }
        LocalDateTime timestamp = LocalDateTime.now();
        String formattedMessage = "[" + timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "] "
                + "[" + level.name() + "] " + message;
        logWriter.println(formattedMessage);
    }

    @Override
    public String getLogFile() {
        return logFilePath;
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            close();
            logFilePath = filePath;
            logWriter = new PrintWriter(new FileWriter(logFilePath, true));
        } catch (IOException e) {
            throw new RuntimeException("Error setting log file: " + e.getMessage(), e);
        }
    }

    @Override
    public void flush() {
        if (logWriter != null) {
            logWriter.flush();
        }
    }

    @Override
    public void close() {
        if (logWriter != null) {
            logWriter.close();
            logWriter = null;
        }
    }
}
