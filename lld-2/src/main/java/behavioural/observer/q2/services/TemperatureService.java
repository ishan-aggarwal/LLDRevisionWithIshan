package behavioural.observer.q2.services;

import behavioural.observer.q2.Observer;
import behavioural.observer.q2.utils.NotificationUtils;

public class TemperatureService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}