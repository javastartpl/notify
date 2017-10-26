package pl.notify.logger;

public class ConsoleLogger {

    public void log(String message) {
        System.out.println("LOG INFO " + System.currentTimeMillis() + " " + message);
    }

}
