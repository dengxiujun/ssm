package com.ssm.test.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import com.ssm.test.JUnitDaoBase;

public class UserServiceTest extends JUnitDaoBase {

    @Autowired
    public UserService userService;

    @Test
    public void getUserListTest() {
        List<User> userList = userService.getUserList();

        System.out.println("size = " + userList.size());
        Assert.assertNotNull(userList);

    }
}
