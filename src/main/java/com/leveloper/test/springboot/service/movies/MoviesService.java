package com.leveloper.test.springboot.service.movies;

import com.leveloper.test.springboot.api.MovieApiClient;
import com.leveloper.test.springboot.web.dto.MoviesResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MoviesService {
    private final MovieApiClient movieApiClient;

    @Transactional(readOnly = true)
    public MoviesResponseDto findByKeyword(String keyword) {
        return movieApiClient.requestMovie(keyword);
    }
}
