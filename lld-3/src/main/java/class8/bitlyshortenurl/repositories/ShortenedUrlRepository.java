package class8.bitlyshortenurl.repositories;

import class8.bitlyshortenurl.models.ShortenedUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShortenedUrlRepository extends JpaRepository<ShortenedUrl, Integer> {

    Optional<ShortenedUrl> findByShortUrl(String shortUrl);
}
