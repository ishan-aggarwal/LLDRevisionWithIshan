package creational.abstractfactory.q3.template;

import creational.abstractfactory.q3.NotificationType;

public abstract class NotificationTemplate {
    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String applyTemplate();

    public abstract NotificationType notificationType();

}