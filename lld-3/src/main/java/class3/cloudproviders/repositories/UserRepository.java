package class3.cloudproviders.repositories;

import class3.cloudproviders.models.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findUserById(long userId);
}
