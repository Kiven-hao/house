package com.mooc.house.controller;

import com.mooc.house.common.model.User;
import com.mooc.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther BH
 * @Date 2019/3/4 17:20
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
