package com.example.websitespringboot.mapper;

import com.example.websitespringboot.entity.New;
import com.example.websitespringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperNew {
  @Select("select * from sys_new")
  List<New> findAll();
}
