package com.leveloper.test.springboot.api;

import com.leveloper.test.springboot.web.dto.MoviesResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class MovieApiClient {
    private final RestTemplate restTemplate;

    private final String CLIENT_ID = "6QI7gP6aDyR9bZhsRSmN";
    private final String CLIENT_SECRET = "ahdGQvIroe";

    private final String OpenNaverMovieUrl_getMovies = "https://openapi.naver.com/v1/search/movie.json?query={keyword}";

    public MoviesResponseDto requestMovie(String keyword) {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);

        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(OpenNaverMovieUrl_getMovies, HttpMethod.GET, entity, MoviesResponseDto.class, keyword).getBody();
    }
}
