package pl.notify.app;

import pl.notify.logger.ConsoleLogger;
import pl.notify.logger.FileLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.FileNotificationReader;
import pl.notify.sender.EmailNotificationSender;

import java.io.IOException;


public class NotificationApplication {
    public static void main(String[] args) {
        FileNotificationReader reader = new FileNotificationReader();
        EmailNotificationSender sender = new EmailNotificationSender();
        NotifyLogger logger = new FileLogger();
        NotificationFacade app = new NotificationFacade(reader, sender, logger);
        try {
            app.sendNotifications();
        } catch (IOException e) {
            System.err.println("Nie udało się wysłać powiadomień");
        }
    }
}
