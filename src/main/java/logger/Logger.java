package logger;

import static logger.Level.*;

public abstract class Logger {

    protected abstract void sendMessage(String message);

    private void log(Level level, String message) {
        String formattedString = String.format("[" + level + "]: " + message + '\n');
        sendMessage(formattedString);
    }

    public void trace(String message) {
        log(TRACE, message);
    }

    public void debug(String message) {
        log(DEBUG, message);
    }

    public void info(String message) {
        log(INFO, message);
    }

    public void warn(String message) {
        log(WARN, message);
    }

    public void error(String message) {
        log(ERROR, message);
    }

    public void fatal(String message) {
        log(FATAL, message);
    }
}
