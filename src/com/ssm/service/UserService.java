package com.ssm.service;

import java.util.List;

import com.ssm.domain.User;

public interface UserService {

    public User getUserById(String id);

    public List<User> getUserList();
}
