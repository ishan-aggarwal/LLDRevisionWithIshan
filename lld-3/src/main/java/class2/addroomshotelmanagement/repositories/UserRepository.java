package class2.addroomshotelmanagement.repositories;

import class2.addroomshotelmanagement.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long userId);

    User save(User user);
}
