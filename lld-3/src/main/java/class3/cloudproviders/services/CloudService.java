package class3.cloudproviders.services;

import class3.cloudproviders.exceptions.UserNotFoundException;
import class3.cloudproviders.models.Connection;

public interface CloudService {
    Connection createConnection(Long userId) throws UserNotFoundException;
}
