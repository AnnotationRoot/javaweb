package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by hello world on 2018/10/21.
 */
public interface UserDao {
    public List<User> selectAll();
}
