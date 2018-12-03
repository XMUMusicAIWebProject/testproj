package com.sys3.repositories;

import com.sys3.model.Seminar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeminarRepository extends JpaRepository<Seminar,Integer> {
}
