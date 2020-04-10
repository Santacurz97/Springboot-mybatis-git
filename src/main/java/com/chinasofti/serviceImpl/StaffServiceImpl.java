package com.chinasofti.serviceImpl;

import com.chinasofti.entity.Staff;
import com.chinasofti.mapper.StaffMapper;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;


    @Override
    public PageBean<Staff> selectAllStaffs(int page, int limit) {
        PageHelper.offsetPage((page-1)*limit, limit);
        List<Staff> staffs = staffMapper.selectAllStuffs();
        PageInfo<Staff> pageInfo = new PageInfo<>(staffs);
        PageBean<Staff> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(staffs);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
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
    public Boolean updateStaff(Staff staff) {
        int i = staffMapper.updateByPrimaryKeySelective(staff);
        if(i == 1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeStaff(int id) {
        int i = staffMapper.deleteByPrimaryKey(id);
        if(i == 1){
            return true;
        }
        return false;
    }
}
