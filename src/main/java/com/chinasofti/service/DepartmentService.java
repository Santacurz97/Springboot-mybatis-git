package com.chinasofti.service;

import com.chinasofti.entity.Department;
import com.chinasofti.entity.Staff;
import com.chinasofti.util.PageBean;
import java.util.List;

public interface DepartmentService {
    //查询所有部门
    public PageBean<Department> selectAllDepartment(int page, int limit);

    //查询所有部门
    public List<Department> selectAll();

    //根据id查询
    public Department selectDepartmentById(int id);

    //查询部门员工
    //public List<Staff> getStaffs(int departmentid);

    //添加部门
    public int addDepartment(Department department);

    //删除部门
    public int delDepartment(int department);

    //修改部门信息
    public int DepartmentUpdata(Department department);

    //查询部门
    PageBean<Department> selectDepartment(int departIdValue,String departValue);

}
