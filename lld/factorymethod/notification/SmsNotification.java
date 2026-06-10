package lld.factorymethod.notification;

public class SmsNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Message sent via SMS: " + message);
    }
}
