package com.sys3.repositories;

import com.sys3.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    public Teacher findByTeacherId(Integer teacherId);
}
