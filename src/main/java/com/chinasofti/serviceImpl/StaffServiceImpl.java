package com.chinasofti.serviceImpl;

import com.chinasofti.entity.Department;
import com.chinasofti.entity.Post;
import com.chinasofti.entity.Staff;
import com.chinasofti.entity.StaffExample;
import com.chinasofti.mapper.DepartmentMapper;
import com.chinasofti.mapper.PostMapper;
import com.chinasofti.mapper.StaffMapper;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import com.chinasofti.vo.StaffVo;
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

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private PostMapper postMapper;


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

    //模糊查询
    @Override
    public PageBean<Staff> searchStaff(int staffId, String staffName) {
        List<Staff> staff = staffMapper.searchStaff(staffId,staffName);
        System.out.println(staff);
        PageInfo<Staff> pageInfo = new PageInfo<>();
        PageBean<Staff> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(staff);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
    }

    //查询部门表和岗位表
    @Override
    public StaffVo search() {
        List<Post> posts = postMapper.queryAllPost();
        List<Department> departments = departmentMapper.selectByExample(null);
        StaffVo staffVo = new StaffVo();
        staffVo.setDepartmentList(departments);
        staffVo.setPostList(posts);
        return staffVo;
    }

    @Override
    public List<Staff> selectOneStaff(int staffId) {
        List<Staff> list = staffMapper.selectOneStaff(staffId);
        return  list;
    }
}
