package com.test.service.impl;


import com.test.bean.QueryVo;
import com.test.bean.User;
import com.test.dao.IUserDao;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yqlbd on 2016/11/27.
 * Service实体类
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> getUsersByList(QueryVo queryVo) {
        return userDao.getUsersByList(queryVo);
    }

    @Override
    public User getDubboUser() {
        User user = new User();
        user.setName("王锋");
        user.setPassword("张璠");
        user.setAge(18);
        user.setId(100);
        return user;
    }


}
