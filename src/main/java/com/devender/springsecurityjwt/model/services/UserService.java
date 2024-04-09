package com.devender.springsecurityjwt.model.services;

import com.devender.springsecurityjwt.model.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
