package lld.factorymethod.notification;

public class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Message send via email: " + message);
    }
}
