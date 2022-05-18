package com.ranjini.springboot_01study.service.impl;

import com.ranjini.springboot_01study.mapper.SmbmsUserMapper;
import com.ranjini.springboot_01study.pojo.SmbmsUser;
import com.ranjini.springboot_01study.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmbmsUserServiceImpl implements SmbmsUserService {
    @Autowired
    private SmbmsUserMapper smbmsUserMapper;

    @Override
    public SmbmsUser selectSmbmsUserByid(int id) {

        return smbmsUserMapper.selectUserByid(id);
    }
}
