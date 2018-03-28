package com.mySSM.dao;

import com.mySSM.model.User;

public interface IUserDao {
    User selectUser(long id);
    void addUser(User user);
}
