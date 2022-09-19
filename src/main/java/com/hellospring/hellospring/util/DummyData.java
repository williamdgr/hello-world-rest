package com.hellospring.hellospring.util;

import com.hellospring.hellospring.entity.InfoPost;
import com.hellospring.hellospring.repository.InfoPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class DummyData {

//    @Autowired
//    InfoPostRepository infoPostRepository;
//
//    @PostConstruct
//    public void saveInfoPosts() {
//
//        List<InfoPost> infoPostList = Arrays.asList(
//                InfoPost.builder().data(LocalDate.now()).author("Angelo").text(UUID.randomUUID().toString()).title("Title 1").build(),
//                InfoPost.builder().data(LocalDate.now()).author("Jake").text(UUID.randomUUID().toString()).title("Title 2").build(),
//                InfoPost.builder().data(LocalDate.now()).author("Flog").text(UUID.randomUUID().toString()).title("Title 3").build()
//        );
//
//        infoPostRepository.saveAll(infoPostList);
//    }
}
