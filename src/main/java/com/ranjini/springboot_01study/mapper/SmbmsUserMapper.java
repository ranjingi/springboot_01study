package com.ranjini.springboot_01study.mapper;

import com.ranjini.springboot_01study.pojo.SmbmsUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmbmsUserMapper {
    SmbmsUser selectUserByid(int id);
}
