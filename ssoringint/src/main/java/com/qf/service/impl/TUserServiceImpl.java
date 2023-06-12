package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.mapper.ITUserMapper;
import com.qf.pojo.Page;
import com.qf.pojo.TUser;
import com.qf.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserServiceImpl  implements ITUserService {

    @Autowired
    private ITUserMapper itUserMapper;

    @Override
    public List<TUser> queryAllTUser() {
        return itUserMapper.queryAllTUser();
    }

    @Override
    public PageInfo<TUser> queryTUserByPage(Page page) {

        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<TUser> tUsers = itUserMapper.queryAllTUser();
        PageInfo<TUser> pageInfo = new PageInfo<>(tUsers);
        return pageInfo;
    }
}
