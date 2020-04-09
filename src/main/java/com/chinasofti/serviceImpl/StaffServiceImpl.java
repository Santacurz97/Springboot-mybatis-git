package com.chinasofti.serviceImpl;

import com.chinasofti.entity.Staff;
import com.chinasofti.mapper.StaffMapper;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;


    @Override
    public PageBean<Staff> selectAllStaffs(int page, int limit) {
        return null;
    }

    @Override
    public int addStaff(Staff staff) {
        int i = staffMapper.insert(staff);
        return i;
    }

    //通过id查询
    @Override
    public Staff selectStaffById(int id) {
        Staff staff = staffMapper.selectByPrimaryKey(id);
        return staff;
    }

    @Override
    public int updateStaff(Staff staff) {
        int i = staffMapper.updateByPrimaryKeySelective(staff);
        return i;
    }

    @Override
    public int removeStaff(int id) {
        int i = staffMapper.deleteByPrimaryKey(id);
        return i;
    }
}
