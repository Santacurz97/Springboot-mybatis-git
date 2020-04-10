package com.chinasofti.controller;


import com.chinasofti.entity.Department;
import com.chinasofti.service.DepartmentService;
import com.chinasofti.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dep")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //部门管理跳转
    @RequestMapping("todepartment")
    public String todepartment(){
        return "department";
    }

    //部门信息
    @RequestMapping("departmentList")
    @ResponseBody
    public PageBean<Department> departmentList(int page, int limit){
        PageBean<Department> pageBean = departmentService.selectAllDepartment(page,limit);
        return pageBean;
    }

    //查询部门信息
    @RequestMapping("searchDepartment")
    @ResponseBody
    public PageBean<Department> searchDepartment(int departIdValue, String departValue){
        System.out.println(departIdValue);
        System.out.println(departValue);
        PageBean<Department> pageBean = departmentService.selectDepartment(departIdValue,departValue);
        return pageBean;
    }

    //新增部门管理跳转
    @RequestMapping("toaddDepartment")
    public String toaddDepartment(Model model){
        List<Department> list = departmentService.selectAll();
        model.addAttribute("SdepartList", list);
        return "addDepartment";
    }

    //新增部门
    @RequestMapping("addDepartment")
    //@ResponseBody
    public String AddDeps(Department department, Model model,HttpSession session){
        if(departmentService.addDepartment(department)>0){
            model.addAttribute("ingfo","添加成功");
            return "department";
        }
        else{
            return "addDepartment";
        }
    }

    //删除部门
    @RequestMapping("delDepartment")
    @ResponseBody
    public String DelDepartment(int id){
        int num = 0;
        num = departmentService.delDepartment(id);
        return "department";
    }

    //修改部门
    @RequestMapping("toupdateDepartment")
    @ResponseBody
    public String UpDepartment(int id){

        return "department";
    }

}
