package com.chinasofti.service;

import com.chinasofti.entity.Staff;
import com.chinasofti.util.PageBean;

public interface StaffService {
    //查询所有员工
    PageBean<Staff> selectAllStaffs(int page, int limit);

    //添加员工
    int addStaff(Staff staff);

    //修改
    Boolean updateStaff(Staff staff);

    //删除
    Boolean removeStaff(int id);

    //模糊查询
    PageBean<Staff> searchStaff(int staffId, String staffName);
}
