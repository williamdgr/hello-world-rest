package com.hellospring.hellospring;

import com.hellospring.hellospring.entity.Cep;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {

		RestTemplate template = new RestTemplate();

		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("http")
				.host("viacep.com.br")
				.path("/ws/01001000/json/")
				.build();

		ResponseEntity<Cep> entity = template.getForEntity(uri.toUri(), Cep.class);

		System.out.println("Response " + entity.getBody());

	}
}
