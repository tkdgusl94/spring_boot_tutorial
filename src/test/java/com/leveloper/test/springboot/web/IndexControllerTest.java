package com.leveloper.test.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩(){
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).contains("영화 검색");
    }

    @Test
    public void 게시판페이지_로딩(){
        //when
        String body = this.restTemplate.getForObject("/board", String.class);

        //then
        assertThat(body).contains("게시판");
    }


}
