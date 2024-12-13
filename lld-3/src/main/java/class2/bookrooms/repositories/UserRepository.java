package class2.bookrooms.repositories;

import class2.bookrooms.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
