package com.devender.springsecurityjwt.controllers;

import com.devender.springsecurityjwt.model.entity.User;
import com.devender.springsecurityjwt.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getHome(){

        return this.userService.getUsers();
    }

    @GetMapping(value = "/curr-user")
    public String getCurrentUser(Principal principal){
        return principal.getName();
    }
}
