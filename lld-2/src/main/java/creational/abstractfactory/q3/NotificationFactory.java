package creational.abstractfactory.q3;

import creational.abstractfactory.q3.notification.Notification;
import creational.abstractfactory.q3.sender.NotificationSender;
import creational.abstractfactory.q3.template.NotificationTemplate;

public abstract class NotificationFactory {

    public abstract NotificationType notificationType();

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);

    public abstract NotificationTemplate createTemplate(String templateName);

    public abstract NotificationSender createSender(Notification notification);

}