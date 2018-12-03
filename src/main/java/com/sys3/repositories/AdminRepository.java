package com.sys3.repositories;

import com.sys3.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Administrator,Integer> {
    public Administrator findAdministratorByAdminId(Integer adminId);
}
