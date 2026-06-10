package lld.factorymethod.client;

import lld.factorymethod.notification.EmailNotificationCreator;
import lld.factorymethod.notification.NotificationCreator;
import lld.factorymethod.notification.SmsNotificationCreator;

public class NotificationService {
    private NotificationCreator nCreator;
    private String notificationType;

    public NotificationService(String notificationType) {
        this.notificationType = notificationType;
    }

    public void send() {
        switch(this.notificationType) {
            case "email": 
            nCreator = new EmailNotificationCreator();
            nCreator.notifyUser();
            break;
            
            case "sms": 
            nCreator = new SmsNotificationCreator();
            nCreator.notifyUser();
            break;
            
            default:
                System.out.println("Undefined notification type");
                break;
        }
    }
}
