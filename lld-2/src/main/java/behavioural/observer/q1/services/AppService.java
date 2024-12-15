package behavioural.observer.q1.services;

import behavioural.observer.q1.Observer;
import behavioural.observer.q1.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}