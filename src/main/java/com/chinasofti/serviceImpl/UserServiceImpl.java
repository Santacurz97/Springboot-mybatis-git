package com.chinasofti.serviceImpl;


import com.chinasofti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //添加事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userService;
    @Override
    public void saveUser(TUser tUser) {
        userService.saveUser(tUser);
    }

    @Override
    public List<TUser> search() {
        return userService.search();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
