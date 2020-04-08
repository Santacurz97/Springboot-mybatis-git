package com.chinasofti.service;

import com.chinasofti.entity.TUser;

import java.util.List;

public interface UserService {
    void saveUser(TUser tUser);

    List<TUser> search();
}
