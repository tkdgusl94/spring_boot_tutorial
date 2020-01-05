package com.leveloper.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정해줌.
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
