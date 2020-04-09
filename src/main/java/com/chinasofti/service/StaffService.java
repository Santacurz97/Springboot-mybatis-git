package com.chinasofti.service;

import com.chinasofti.entity.Staff;
import com.chinasofti.util.PageBean;

public interface StaffService {
    //查询所有员工
    PageBean<Staff> selectAllStaffs(int page, int limit);

    //通过id查询
    Staff selectStaffById(int id);

    //添加员工
    int addStaff(Staff staff);

    //修改
    int updateStaff(Staff staff);

    //删除
    int removeStaff(int id);

}
