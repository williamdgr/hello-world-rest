package com.hellospring.hellospring.controller;

import com.hellospring.hellospring.entity.Cep;
import com.hellospring.hellospring.service.CepService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/example")
@AllArgsConstructor
public class CepController {

    public CepService cepService;

    @GetMapping("/hello-world")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/requestCep")
    public ResponseEntity<Cep>  getCep() {
        return cepService.requestTest();
    }
}

