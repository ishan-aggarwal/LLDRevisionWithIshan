package class8.bitlyshortenurl.services;

import class8.bitlyshortenurl.exceptions.UrlNotFoundException;
import class8.bitlyshortenurl.exceptions.UserNotFoundException;
import class8.bitlyshortenurl.models.ShortenedUrl;

public interface UrlService {
    public ShortenedUrl shortenUrl(String url, int userId) throws UserNotFoundException;

    public String resolveShortenedUrl(String shortUrl) throws UrlNotFoundException;
}
