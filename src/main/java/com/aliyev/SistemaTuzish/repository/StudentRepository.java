package com.aliyev.SistemaTuzish.repository;

import com.aliyev.SistemaTuzish.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <User, Integer>{
}
