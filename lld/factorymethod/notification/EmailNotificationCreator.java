package lld.factorymethod.notification;

public class EmailNotificationCreator extends NotificationCreator {
    public INotification createNotification() {
        return new EmailNotification();
    }
}
