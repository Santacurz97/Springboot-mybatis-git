package com.chinasofti.serviceImpl;

import com.chinasofti.dao.UserDao;
import com.chinasofti.entity.TUser;
import com.chinasofti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //添加事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void saveUser(TUser tUser) {
        userDao.save(tUser);
    }

    @Override
    public List<TUser> search() {
        return userDao.searchUsers();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
