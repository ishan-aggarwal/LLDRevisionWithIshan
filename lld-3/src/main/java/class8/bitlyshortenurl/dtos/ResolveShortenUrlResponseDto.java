package class8.bitlyshortenurl.dtos;

import lombok.Data;

@Data
public class ResolveShortenUrlResponseDto {
    private String originalUrl;
    private ResponseStatus status;
}
