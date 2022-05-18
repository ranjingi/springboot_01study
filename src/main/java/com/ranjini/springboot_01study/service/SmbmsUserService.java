package com.ranjini.springboot_01study.service;

import com.ranjini.springboot_01study.mapper.SmbmsUserMapper;
import com.ranjini.springboot_01study.pojo.SmbmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface SmbmsUserService {
   public SmbmsUser selectSmbmsUserByid(int id);


}
