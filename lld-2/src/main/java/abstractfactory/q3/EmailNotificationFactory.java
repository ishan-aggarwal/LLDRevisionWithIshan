package abstractfactory.q3;

import abstractfactory.q3.notification.EmailNotification;
import abstractfactory.q3.notification.Notification;
import abstractfactory.q3.sender.EmailNotificationSender;
import abstractfactory.q3.sender.NotificationSender;
import abstractfactory.q3.template.EmailNotificationTemplate;
import abstractfactory.q3.template.NotificationTemplate;

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