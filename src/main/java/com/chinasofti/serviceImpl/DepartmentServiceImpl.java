package com.chinasofti.serviceImpl;


import com.chinasofti.mapper.DepartmentMapper;
import com.chinasofti.service.DepartmentService;
import com.chinasofti.entity.Department;
import com.chinasofti.util.PageBean;
import com.chinasofti.entity.Staff;
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

        //PageHelper.offsetPage((page-1)*limit,limit);
        return null;
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
