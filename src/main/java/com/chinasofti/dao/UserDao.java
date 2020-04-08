package com.chinasofti.dao;

import com.chinasofti.entity.TUser;

import java.util.List;

public interface UserDao {
    void save(TUser tuser);

    List<TUser> searchUsers();
}
