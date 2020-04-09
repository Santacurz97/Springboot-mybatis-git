package com.chinasofti.service;

import java.util.List;

public interface UserService {
    void saveUser(TUser tUser);

    List<TUser> search();
}
