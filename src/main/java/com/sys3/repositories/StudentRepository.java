package com.sys3.repositories;

import com.sys3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByStudentId(Integer studentId);
}
