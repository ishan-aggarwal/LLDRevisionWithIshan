package creational.abstractfactory.q3.sender;

import creational.abstractfactory.q3.NotificationType;
import creational.abstractfactory.q3.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}