package class8.outofstocknotification.services;

import class8.outofstocknotification.exceptions.*;
import class8.outofstocknotification.models.Notification;

public interface NotificationService {

    public Notification registerUser(int userId, int productId) throws UserNotFoundException, ProductNotFoundException, ProductInStockException;

    public void deregisterUser(int userId, int notificationId) throws UserNotFoundException, NotificationNotFoundException, UnAuthorizedException;
}
