package com.spring.mvc.controllers;

import com.spring.mvc.been.User;
import com.spring.mvc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/all")
    public List<User> getUsers() {
        List<User> users = userMapper.getAll();
        return users;
    }

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") long id) {
        User user = userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        userMapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(User user) {
        userMapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
