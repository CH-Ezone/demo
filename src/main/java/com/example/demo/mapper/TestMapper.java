package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestMapper {
    List<Map<String,Object>> getList();
   void  add(User user);
   int getId();
}
