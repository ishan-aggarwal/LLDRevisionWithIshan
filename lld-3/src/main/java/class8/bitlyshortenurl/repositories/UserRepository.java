package class8.bitlyshortenurl.repositories;

import class8.bitlyshortenurl.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User save(User user);

}
