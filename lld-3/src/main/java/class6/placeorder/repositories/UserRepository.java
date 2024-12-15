package class6.placeorder.repositories;

import class6.placeorder.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
