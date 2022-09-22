package com.example.websitespringboot.controller;

import com.example.websitespringboot.entity.New;
import com.example.websitespringboot.entity.User;
import com.example.websitespringboot.mapper.MapperNew;
import com.example.websitespringboot.mapper.MapperUser;
import com.example.websitespringboot.service.impl.NewServiceImpl;
import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试接口
 */
@RestController
@RequestMapping("/")
public class demo {
  @Resource
  private NewServiceImpl newService;
  @GetMapping("/")
  public List<New> getList(){
    return newService.findAll();
  }
}
