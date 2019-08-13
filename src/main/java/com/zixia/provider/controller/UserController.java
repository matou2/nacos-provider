package com.zixia.provider.controller;

import com.zixia.provider.entity.User;
import com.zixia.provider.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author teng.wang1.o
 * @date 2019/8/12
 * @Description
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("getUsers")
    public void getUsers(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
       log.info("查询出的总人数:{}",userList.size());
        userList.forEach(System.out::println);
    }
}
