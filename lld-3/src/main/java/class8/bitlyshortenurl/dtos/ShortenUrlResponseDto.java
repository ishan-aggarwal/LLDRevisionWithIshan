package class8.bitlyshortenurl.dtos;

import lombok.Data;

@Data
public class ShortenUrlResponseDto {
    private String shortUrl;
    private long expiresAt;
    private ResponseStatus status;
}
