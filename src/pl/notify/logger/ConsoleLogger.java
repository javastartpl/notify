package pl.notify.logger;

public class ConsoleLogger implements NotifyLogger {

    public void log(String message) {
        System.out.println("LOG INFO " + System.currentTimeMillis() + " " + message);
    }

}
