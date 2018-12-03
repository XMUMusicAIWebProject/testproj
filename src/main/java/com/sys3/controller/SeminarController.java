package com.sys3.controller;

import com.sys3.model.Seminar;
import com.sys3.repositories.SeminarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "seminar")
public class SeminarController {
    @Autowired
    private SeminarRepository seminarRepository;
    @PostMapping(value = "selectAll")
    public ModelAndView seminarList(){
        ModelAndView modelAndView=new ModelAndView("seminar");
        modelAndView.addObject("seminar",seminarRepository.findAll());
        return modelAndView;
    }
}
