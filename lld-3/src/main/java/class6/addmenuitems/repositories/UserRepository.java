package class6.addmenuitems.repositories;

import class6.addmenuitems.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
