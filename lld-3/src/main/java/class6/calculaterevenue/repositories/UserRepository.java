package class6.calculaterevenue.repositories;

import class6.calculaterevenue.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
