package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Page;
import com.qf.pojo.TUser;

import java.util.List;

public interface ITUserService {
    List<TUser> queryAllTUser();

    PageInfo<TUser> queryTUserByPage(Page page);
}
