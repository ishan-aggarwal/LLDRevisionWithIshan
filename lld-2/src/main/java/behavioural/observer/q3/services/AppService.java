package behavioural.observer.q3.services;

import behavioural.observer.q3.Observer;
import behavioural.observer.q3.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, userId));
    }
}