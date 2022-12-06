package com.aliyev.SistemaTuzish.controller;

import com.aliyev.SistemaTuzish.model.User;
import com.aliyev.SistemaTuzish.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class controller {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
      studentService.saveUser(user);
      return "New User is added";
    }

}
