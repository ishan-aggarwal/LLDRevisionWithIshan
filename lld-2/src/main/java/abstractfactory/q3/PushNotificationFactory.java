package abstractfactory.q3;

import abstractfactory.q3.notification.Notification;
import abstractfactory.q3.notification.PushNotification;
import abstractfactory.q3.sender.NotificationSender;
import abstractfactory.q3.sender.PushNotificationSender;
import abstractfactory.q3.template.NotificationTemplate;
import abstractfactory.q3.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new PushNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
}