package com.ranjini.springboot_01study.controller;

import com.alibaba.fastjson.JSON;
import com.ranjini.springboot_01study.pojo.SmbmsUser;
import com.ranjini.springboot_01study.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SmbmsUserController {
    @Autowired
    private SmbmsUserService smbmsUserService;
    @RequestMapping("/sbmsUser")
    public @ResponseBody
    String SbmsIndex(int id){
        System.out.println(id);
        SmbmsUser smbmsUser = smbmsUserService.selectSmbmsUserByid(id);
        String smuser = JSON.toJSONString(smbmsUser);
        return smuser;
    };
    @RequestMapping("/sbmsUser/{id}")
    public @ResponseBody
    String rest(@PathVariable(value = "id") int id){
        System.out.println(id);
        SmbmsUser smbmsUser = smbmsUserService.selectSmbmsUserByid(id);
        String smuser = JSON.toJSONString(smbmsUser);
        return smuser;
    };
}
