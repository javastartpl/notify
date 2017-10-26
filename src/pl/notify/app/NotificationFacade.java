package pl.notify.app;

import pl.notify.logger.ConsoleLogger;
import pl.notify.model.Notification;
import pl.notify.reader.FileNotificationReader;
import pl.notify.sender.EmailNotificationSender;

import java.io.IOException;
import java.util.List;

public class NotificationFacade {

    public void sendNotifications() throws IOException {
        FileNotificationReader reader = new FileNotificationReader();
        EmailNotificationSender sender = new EmailNotificationSender();
        ConsoleLogger logger = new ConsoleLogger();

        List<Notification> notifications = reader.getNotifications();
        for (Notification notification : notifications) {
            sender.send(notification);
            logger.log(notification.toString());
        }
    }

}
