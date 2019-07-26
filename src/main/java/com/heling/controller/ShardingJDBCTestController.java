package com.heling.controller;

import com.alibaba.fastjson.JSONObject;
import com.heling.mapper.UserMapper;
import com.heling.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author whl
 * @description
 * @date 2019/07/25 20:59
 */
@RestController
@RequestMapping("test")
public class ShardingJDBCTestController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("shardingJDBC")
    public String testShardingJDBC() {
        userMapper.insertSelective(new User(1,"heling"));
        userMapper.insertSelective(new User(2,"ls"));
        userMapper.insertSelective(new User(3,"ww"));
        return "success";
    }

    @GetMapping("shardingJDBC")
    public String testShardingJDBC02() {
        User user = userMapper.selectByPrimaryKey(3);
        return JSONObject.toJSONString(user);
    }

}
