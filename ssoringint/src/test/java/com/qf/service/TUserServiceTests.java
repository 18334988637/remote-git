package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Page;
import com.qf.pojo.TUser;
import com.qf.service.ITUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TUserServiceTests {
    @Test
    public void queryAllTUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITUserService userService = (ITUserService)ac.getBean("TUserServiceImpl");
        System.out.println(userService.queryAllTUser());
    }
    @Test
    public void queryTUserByPage(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITUserService userService = (ITUserService)ac.getBean("TUserServiceImpl");
        Page page = new Page(2,2);
        PageInfo<TUser> pageInfo = userService.queryTUserByPage(page);
        System.out.println(pageInfo);
    }
}
