package class8.bitlyshortenurl.controllers;

import class8.bitlyshortenurl.dtos.*;
import class8.bitlyshortenurl.models.ShortenedUrl;
import class8.bitlyshortenurl.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UrlController {

    private UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    public ShortenUrlResponseDto shortenUrl(ShortenUrlRequestDto requestDto) {

        ShortenUrlResponseDto responseDto = new ShortenUrlResponseDto();
        try{
            ShortenedUrl shortenedUrl = urlService.shortenUrl(requestDto.getOriginalUrl(), requestDto.getUserId());
            responseDto.setShortUrl(shortenedUrl.getShortUrl());
            responseDto.setExpiresAt(shortenedUrl.getExpiresAt());
            responseDto.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }

    public ResolveShortenUrlResponseDto resolveShortenedUrl(ResolveShortenUrlRequestDto requestDto) {
        ResolveShortenUrlResponseDto responseDto = new ResolveShortenUrlResponseDto();
        try{
            String originalUrl = urlService.resolveShortenedUrl(requestDto.getShortenUrl());
            responseDto.setOriginalUrl(originalUrl);
            responseDto.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            responseDto.setStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
