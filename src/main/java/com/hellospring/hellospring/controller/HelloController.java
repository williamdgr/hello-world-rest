package com.hellospring.hellospring.controller;

import com.hellospring.hellospring.entity.Cep;
import com.hellospring.hellospring.entity.InfoPost;
import com.hellospring.hellospring.repository.InfoPostRepository;
import com.hellospring.hellospring.service.CepService;
import com.hellospring.hellospring.util.DummyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    public InfoPostRepository infoPostRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView mv = new ModelAndView("welcome");
        return mv.addObject("something", "Value from java");
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getInfoPost() {
        ModelAndView mv = new ModelAndView("infoPostView");
        return mv.addObject("infoPostList", infoPostRepository.findAll());
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String categoryEdit(InfoPost info){
        return "redirect:/index";
    }

}
