package creational.abstractfactory.q3;

import creational.abstractfactory.q3.notification.EmailNotification;
import creational.abstractfactory.q3.notification.Notification;
import creational.abstractfactory.q3.sender.EmailNotificationSender;
import creational.abstractfactory.q3.sender.NotificationSender;
import creational.abstractfactory.q3.template.EmailNotificationTemplate;
import creational.abstractfactory.q3.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new EmailNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}