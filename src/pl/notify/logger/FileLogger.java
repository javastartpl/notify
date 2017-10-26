package pl.notify.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements NotifyLogger {

    @Override
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))){
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
