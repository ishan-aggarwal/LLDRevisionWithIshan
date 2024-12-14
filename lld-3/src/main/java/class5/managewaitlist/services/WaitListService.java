package class5.managewaitlist.services;

import class5.managewaitlist.exceptions.UnauthorizedAccessException;
import class5.managewaitlist.exceptions.UserNotFoundException;

public interface WaitListService {

    int addUserToWaitList(long userId) throws UserNotFoundException;

    int getWaitListPosition(long userId) throws UserNotFoundException;

    void updateWaitList(long adminUserId, int numberOfSpots) throws UserNotFoundException, UnauthorizedAccessException;

}
