package class5.managewaitlist.repositories;

import class5.managewaitlist.models.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(long id);
}
