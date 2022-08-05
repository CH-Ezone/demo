package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;

    @RequestMapping("index")
    public  String index(){return "test";
    }
   @RequestMapping("getList")
    public Object getList(){
        return testMapper.getList();
   }
    @RequestMapping("add")
    public Object add(User user){
        int id = testMapper.getId();
        user.setId(id+1);
        testMapper.add(user);
        return "success";
    }
}
