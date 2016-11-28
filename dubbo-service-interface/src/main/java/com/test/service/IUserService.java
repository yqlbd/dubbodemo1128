package com.test.service;


import com.test.bean.QueryVo;
import com.test.bean.User;

import java.util.List;

/**
 * Created by yqlbd on 2016/11/27.
 */
public interface IUserService {

     User getUserById(Integer id);

     void insertUser(User user);

     List<User> getUsersByList(QueryVo queryVo);

     User getDubboUser();
}
