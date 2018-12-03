package com.sys3.controller;

import com.sys3.model.Administrator;
import com.sys3.model.Student;
import com.sys3.model.Teacher;
import com.sys3.repositories.AdminRepository;
import com.sys3.repositories.StudentRepository;
import com.sys3.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping(value = "selectAll")
    public List<Administrator> administratorList(){
        return adminRepository.findAll();
    }
    @GetMapping(value = "selectAllTeacher")
    public List<Teacher> teacherList(){
        return teacherRepository.findAll();
    }
    @GetMapping(value = "selectAllStudent")
    public List<Student> studentList(){
        return studentRepository.findAll();
    }
    @GetMapping(value = "selectById")
    public Administrator findAdministratorByAdminId(Integer adminId){
        return adminRepository.findAdministratorByAdminId(adminId);
    }
}

