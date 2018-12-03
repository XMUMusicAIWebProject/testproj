package com.sys3.controller;

import com.sys3.model.Course;
import com.sys3.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @RequestMapping(value = "selectAll")
    public List<Course> courseList(){
        return courseRepository.findAll();
    }
    @GetMapping(value = "findByTeacher")
    public List<Course> findByTeacher(Integer teacherId){
        return courseRepository.findByTeacherId(teacherId);
    }
}
