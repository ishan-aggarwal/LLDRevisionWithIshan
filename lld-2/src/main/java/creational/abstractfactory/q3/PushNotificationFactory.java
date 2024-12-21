package creational.abstractfactory.q3;

import creational.abstractfactory.q3.notification.Notification;
import creational.abstractfactory.q3.notification.PushNotification;
import creational.abstractfactory.q3.sender.NotificationSender;
import creational.abstractfactory.q3.sender.PushNotificationSender;
import creational.abstractfactory.q3.template.NotificationTemplate;
import creational.abstractfactory.q3.template.PushNotificationTemplate;

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