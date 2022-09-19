package com.hellospring.hellospring.repository;

import com.hellospring.hellospring.entity.InfoPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoPostRepository extends JpaRepository<InfoPost, Long> {
}
