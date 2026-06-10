package lld.factorymethod.notification;

public abstract class NotificationCreator {
    protected abstract INotification createNotification();

    public void notifyUser() {
        INotification notification = this.createNotification();
        notification.sendNotification("Hello from Ankit.");
    }
}
