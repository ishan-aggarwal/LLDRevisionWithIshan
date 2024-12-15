package class8.bitlyshortenurl.repositories;

import class8.bitlyshortenurl.models.UrlAccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlAccessLogRepository extends JpaRepository<UrlAccessLog, Long> {
}
