package com.chinasofti.serviceImpl;


import com.chinasofti.entity.DepartmentExample;
import com.chinasofti.mapper.DepartmentMapper;
import com.chinasofti.service.DepartmentService;
import com.chinasofti.entity.Department;
import com.chinasofti.util.PageBean;
import com.chinasofti.entity.Staff;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    //查询所有部门
    @Override
    public PageBean<Department> selectAllDepartment(int page, int limit){
        //获取数据
        PageHelper.offsetPage((page-1)*limit, limit);
        List<Department> departments = departmentMapper.selectAllDep();
        System.out.println(departments.get(0).getSdepartmentName());
        PageInfo<Department> pageInfo = new PageInfo<>(departments);
        PageBean<Department> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(departments);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
    }

    //查询所有部门
    @Override
    public List<Department> selectAll(){
        //获取数据
        return departmentMapper.selectByExample(null);
    }

    //查询某个部门
    @Override
    public PageBean<Department> selectDepartment(int departIdValue,String departValue){
        List<Department> departments = departmentMapper.selectDep(String.valueOf(departIdValue),departValue);
        PageInfo<Department> pageInfo = new PageInfo<>(departments);
        PageBean<Department> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(departments);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
    }

    //根据id查询
    @Override
    public Department selectDepartmentById(int id){
        Department department = departmentMapper.selectByPrimaryKey(id);
        return department;
    }

//    //查询部门员工
//    public List<Staff> getStaffs(int departmentid){
//
//    }

    //添加部门
    @Override
    public int addDepartment(Department department){
        int num = 0;
        department.setDepartmentAdddate(new Date());
        num = departmentMapper.insertSelective(department);
        return num;
    }

    //删除部门
    @Override
    public int delDepartment(int departmentid){
        int num = 0;
        num = departmentMapper.deleteByPrimaryKey(departmentid);
        return num;
    }

    //修改部门信息
    @Override
    public int DepartmentUpdata(Department department){
        int num = 0;
        num = departmentMapper.updateByPrimaryKeySelective(department);
        return num;
    }

}