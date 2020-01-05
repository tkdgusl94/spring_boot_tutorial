package com.leveloper.test.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") // JPA에서는 복잡한 쿼리문은 지원하지 않는다. 이런식으로 직접 쿼리문을 작성해서 쓰는 것도 가능
    List<Posts> findAllDesc();
}
