package com.chinasofti.test;

import com.chinasofti.MybatisApplication;
import com.chinasofti.entity.Staff;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)
public class TestStaffService {
    @Autowired
    private StaffService staffService;

    @Test
    public void testSelectAllStaffs(){
        PageBean<Staff> pageBean = staffService.selectAllStaffs(1, 5);
        System.out.println(pageBean);
    }

    @Test
    public void testSearchStaff(){
        PageBean<Staff> pageBean = staffService.searchStaff(1, "刘哲");
        System.out.println(pageBean);
    }
}
