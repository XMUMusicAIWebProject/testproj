package com.sys3.repositories;

import com.sys3.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    public List<Course> findByTeacherId(Integer teacherId);
}
