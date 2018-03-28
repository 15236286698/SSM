package com.mySSM.service.impl;


import com.mySSM.dao.IUserDao;
import com.mySSM.model.User;
import javax.annotation.Resource;


public class UserServiceImpl implements IUserDao{
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long id) {
        return this.userDao.selectUser(id);
    }


}