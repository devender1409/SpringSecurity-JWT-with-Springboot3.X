package com.devender.springsecurityjwt.model.services;

import com.devender.springsecurityjwt.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    private final List<User> store = new ArrayList<>();

    public UserServiceImpl() {
        store.add(new User(UUID.randomUUID().toString(),"Devender Kumar","devender.kumar@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Roshan Kumar","roshan.p@dev.in"));
    }


    public List<User> getUsers(){
        return this.store;
    }
}
