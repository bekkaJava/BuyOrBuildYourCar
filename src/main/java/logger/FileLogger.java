package logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class FileLogger extends Logger {
    @Override
    public void sendMessage(String message) {

        try {
            Path logs;
            Path logPath;

            logPath = Paths.get("Logs");
            if (Files.notExists(logPath)) {
                Files.createDirectories(logPath);
            }

            logs = logPath.resolve(LocalDate.now().toString());
            if (Files.notExists(logs)) {
                Files.createFile(logs);
            }

            Files.writeString(logs, message, StandardOpenOption.APPEND);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
