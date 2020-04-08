package com.chinasofti.mapper;

import com.chinasofti.entity.TUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    void save(TUser tUser);

    List<TUser> findAll();
}
