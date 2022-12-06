package com.aliyev.SistemaTuzish.service;

import com.aliyev.SistemaTuzish.model.User;
import com.aliyev.SistemaTuzish.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{


    @Autowired
    private StudentRepository studentRepository;
    @Override
    public User saveUser(User user) {
        return studentRepository.save(user);
    }
}
