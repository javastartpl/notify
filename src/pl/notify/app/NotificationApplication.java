package pl.notify.app;

import java.io.IOException;

/**
 * Created by slawekludw on 26/10/2017.
 */
public class NotificationApplication {
    public static void main(String[] args) {
        NotificationFacade app = new NotificationFacade();
        try {
            app.sendNotifications();
        } catch (IOException e) {
            System.err.println("Nie udało się wysłać powiadomień");
        }
    }
}
