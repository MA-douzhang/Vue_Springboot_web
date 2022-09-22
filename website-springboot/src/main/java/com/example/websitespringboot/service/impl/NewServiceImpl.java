package com.example.websitespringboot.service.impl;

import com.example.websitespringboot.entity.New;
import com.example.websitespringboot.mapper.MapperNew;
import com.example.websitespringboot.service.utils.NewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实现类 service
 * 将接口数据进行封装
 */
@Service
public class NewServiceImpl implements NewService {
  @Resource
  private MapperNew mapperNew;
  @Override
  public List<New> findAll() {
    List<New> findAll = mapperNew.findAll();
    for (New temp:findAll
    ) {
      String time=temp.getDate();
      String[] times=time.split("-");
      times[2]="15";
      time="";
      for (int i = 0; i < times.length; i++) {
        time+=times[i];
      }
      temp.setDate(time);
    }
    return findAll;
  }
}
