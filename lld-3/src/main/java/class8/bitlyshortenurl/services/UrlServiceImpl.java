package class8.bitlyshortenurl.services;

import class8.bitlyshortenurl.exceptions.UrlNotFoundException;
import class8.bitlyshortenurl.exceptions.UserNotFoundException;
import class8.bitlyshortenurl.models.ShortenedUrl;
import class8.bitlyshortenurl.models.UrlAccessLog;
import class8.bitlyshortenurl.models.User;
import class8.bitlyshortenurl.repositories.ShortenedUrlRepository;
import class8.bitlyshortenurl.repositories.UrlAccessLogRepository;
import class8.bitlyshortenurl.repositories.UserRepository;
import class8.bitlyshortenurl.utils.ShortUrlGenerator;
import class8.bitlyshortenurl.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlServiceImpl implements UrlService{

    private ShortenedUrlRepository shortenedUrlRepository;
    private UserRepository userRepository;
    private UrlAccessLogRepository urlAccessLogRepository;

    @Autowired
    public UrlServiceImpl(ShortenedUrlRepository shortenedUrlRepository, UserRepository userRepository, UrlAccessLogRepository urlAccessLogRepository) {
        this.shortenedUrlRepository = shortenedUrlRepository;
        this.userRepository = userRepository;
        this.urlAccessLogRepository = urlAccessLogRepository;
    }


    @Override
    public ShortenedUrl shortenUrl(String url, int userId) throws UserNotFoundException {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        String shortUrl = ShortUrlGenerator.generateShortUrl();
        long expiresAt = UserUtils.getExpiryTimeByUserPlan(user.getUserPlan());
        ShortenedUrl shortenedUrl = new ShortenedUrl();
        shortenedUrl.setOriginalUrl(url);
        shortenedUrl.setShortUrl(shortUrl);
        shortenedUrl.setExpiresAt(expiresAt);
        shortenedUrl.setUser(user);
        return shortenedUrlRepository.save(shortenedUrl);
    }

    @Override
    public String resolveShortenedUrl(String shortUrl) throws UrlNotFoundException {
        Optional<ShortenedUrl> shortenedUrlOptional = shortenedUrlRepository.findByShortUrl(shortUrl);
        if(shortenedUrlOptional.isEmpty()) {
            throw new UrlNotFoundException("Shortened url not found");
        }
        long currentTime = System.currentTimeMillis()/1000;
        if(currentTime > shortenedUrlOptional.get().getExpiresAt()) {
            throw new UrlNotFoundException("Shortened url expired");
        }
        ShortenedUrl shortenedUrl = shortenedUrlOptional.get();
        UrlAccessLog urlAccessLog = new UrlAccessLog();
        urlAccessLog.setShortenedUrl(shortenedUrl);
        urlAccessLog.setAccessedAt(currentTime);
        urlAccessLogRepository.save(urlAccessLog);
        return shortenedUrl.getOriginalUrl();
    }
}
