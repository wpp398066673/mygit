package com.example.hibernatetest.controller;

import com.example.hibernatetest.dao.UserDao;
import com.example.hibernatetest.entity.UserEntity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "创建用户", notes = "创建用户")
    @PostMapping("/saveSingle")
    @ResponseBody
    public UserEntity saveUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("wangwu");
        return userDao.save(userEntity);
    }

    @ApiOperation(value = "根据用户名查询", notes = "根据用户名查询")
    @ApiParam(value = "传入用户姓名")
    @GetMapping("/findByName")
    @ResponseBody
    public Object findByName(String name) {
        return userDao.findByName(name);
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "查询所有用户")
    public Object findAll() {
        return userDao.findAll();
    }
}
