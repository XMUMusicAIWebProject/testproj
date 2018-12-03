package com.sys3.controller;

import com.sys3.model.Student;
import com.sys3.model.Teacher;
import com.sys3.repositories.StudentRepository;
import com.sys3.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "teacher")
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping(value = "selectAll")
    public List<Teacher> teacherList(){
        return teacherRepository.findAll();
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView adminLogin(Integer userid, String password){
        Teacher teacher=teacherRepository.findByTeacherId(userid);
        Student student=studentRepository.findByStudentId(userid);
        ModelAndView studentHome=new ModelAndView("studenthome");
        ModelAndView teacherHome=new ModelAndView("teacherhome");
        ModelAndView login=new ModelAndView("index");
        if(password.equals(student.getPassword())){
            return studentHome;
        }
        else if(password.equals(teacher.getPassword())){
                return teacherHome;
        }
        else {
                return login;
        }
    }
    @RequestMapping(value = "teacherIndex",method =RequestMethod.GET)
    public ModelAndView teacherIndex(){
        ModelAndView modelAndView=new ModelAndView("teacherhome");
        return modelAndView;
    }
}
