package com.dayi.demo.controller;

import com.dayi.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息控制器
 * @author yangshaoqiang <yangshq@pvc123.com>
 * @create 2021-04-04 17:30
 */
@RestController
public class UserController {

    /**
     * 查找所有用户信息
     * @return
     */
    @GetMapping("findAll")
    @CrossOrigin
    public List<User> findAll(String paraValue) {
        System.out.println("接收到的参数：" + paraValue);
        List<User> users = new ArrayList<>();
        users.add(new User(1, "陈艳男", "609937647@qq.com", 23, "13745265478"));
        users.add(new User(2, "小黑", "609937648@qq.com", 24, "13795165478"));
        users.add(new User(3, "小林", "609937689@qq.com", 21, "13741685478"));
        return users;
    }

    /**
     * 保存数据
     * @param user
     * @return
     */
    @PostMapping("/save")
    @CrossOrigin
    public Map<String, Object> save(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>(1);
        System.out.println("user = " + user);
        map.put("success", true);
        return map;
    }

}
