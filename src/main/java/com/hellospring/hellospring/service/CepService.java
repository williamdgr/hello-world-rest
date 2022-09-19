package com.hellospring.hellospring.service;

import com.hellospring.hellospring.entity.Cep;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@AllArgsConstructor
public class CepService {

    public ResponseEntity<Cep> requestTest() {
        RestTemplate template = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("viacep.com.br")
                .path("/ws/01001000/json/")
                .build();

        ResponseEntity<Cep> entity = template.getForEntity(uri.toUri(), Cep.class);

        System.out.println("Response " + entity.getBody());
        return entity;
    }
}
