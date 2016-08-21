package com.ssm.mapper;

import java.util.List;

import com.ssm.domain.User;

public interface UserMapper {

    public User getUserById(String id);

    public List<User> getUserList();
}
