package com.mySSM.service.impl;


import com.mySSM.dao.IUserDao;
import com.mySSM.model.User;
import com.mySSM.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;


public class UserServiceImpl implements IUserDao{
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long id) {
        return this.userDao.selectUser(id);
    }

    @Override
    public void addUser(User user) {
        SqlSessionFactory sessionFactory= MyBatisUtil.getSqlSessionFactory();
        SqlSession session=sessionFactory.openSession();
        // 通过SqlSession操作数据库，查询结果是与映射文件中的resultType相匹配的数据类型
        // 第一个参数：映射文件中Statement的id，等于namespace+"."+statementid
        // 第二个参数：指定和映射文件中的SQL语句匹配的parameter type类型的参数
        session.insert("addUser", user);
        // 提交事务
        session.commit();
        // 打印主键
        System.out.println(user.getId());
        session.close();
        //返回的是受影响的行数，不能返回主键值
        //Integer id=user.getId();
        //return id;
    }
}