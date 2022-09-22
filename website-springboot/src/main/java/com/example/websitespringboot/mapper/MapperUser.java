package com.example.websitespringboot.mapper;

import com.example.websitespringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperUser {
  @Select("select * from sys_user")
  List<User> findAll();
}
