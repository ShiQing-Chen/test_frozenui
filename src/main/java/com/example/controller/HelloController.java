package com.example.controller;

import com.example.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShiQing_Chen
 * @date 2018/11/22 17:56
 */

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model m){
        m.addAttribute("name", "spring-boot");
        return "hello";
    }

    @RequestMapping("sysUser")
    public String user(Model m){
        List<SysUser> list = new ArrayList<SysUser>();
        SysUser u1 = new SysUser(0001, "hello1", "11111111111111111");
        SysUser u2 = new SysUser(0002, "hello2", "22222222222222222");
        SysUser u3 = new SysUser(0003, "hello3", "33333333333333333");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        m.addAttribute("userList", list);
        m.addAttribute("sysUser", "SysUser");
        return "sysUser/list";
    }
}
