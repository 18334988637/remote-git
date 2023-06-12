package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Page;
import com.qf.pojo.TUser;
import com.qf.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class TUserController {

    @Autowired
    private ITUserService userService;

    @RequestMapping("/queryAllTUser")
    public List<TUser> queryAllTUser(){
        return userService.queryAllTUser();
    }

    @RequestMapping("/queryTUserByPage")
    public PageInfo<TUser> queryTUserByPage(Page page){
         return userService.queryTUserByPage(page);
    }
}
