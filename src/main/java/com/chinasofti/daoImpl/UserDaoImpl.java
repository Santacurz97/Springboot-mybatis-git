package com.chinasofti.daoImpl;

import com.chinasofti.dao.UserDao;
import com.chinasofti.entity.TUser;
import com.chinasofti.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(TUser tuser) {
        userMapper.save(tuser);
    }

    @Override
    public List<TUser> searchUsers() {
        return userMapper.findAll();
    }


    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
