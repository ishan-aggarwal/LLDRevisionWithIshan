package class8.bitlyshortenurl.dtos;

import lombok.Data;

@Data
public class ShortenUrlRequestDto {
    private String originalUrl;
    private int userId;
}
