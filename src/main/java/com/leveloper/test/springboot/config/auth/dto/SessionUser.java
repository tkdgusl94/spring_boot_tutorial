package com.leveloper.test.springboot.config.auth.dto;

import com.leveloper.test.springboot.domain.user.User;
import lombok.Getter;

@Getter
public class SessionUser { // 인증된 사용자 정보만 필요하다.
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
