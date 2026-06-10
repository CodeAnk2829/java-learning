package lld.factorymethod.notification;

public class SmsNotificationCreator extends NotificationCreator {
    public INotification createNotification() {
        return new SmsNotification();
    }
}
