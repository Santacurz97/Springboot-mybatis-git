package com.chinasofti.controller;

import com.chinasofti.entity.Staff;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private StaffService staffService;

    /*
     *    用户登入
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(String name,String password, Model model){
        if(name.equals("yqy") && password.equals("123456")){
            return "index";
        }
        model.addAttribute("info", "用户名或密码错误!");
        return "login";
    }

    /**
     * 跳转至员工管理
     * @return
     */
    @RequestMapping("tostaff")
    public String tostaff(){
        return "staff";
    }

    /**
     * 员工信息表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("staffList")
    @ResponseBody
    public PageBean<Staff> staffList(int page, int limit){
        PageBean<Staff> pageBean = staffService.selectAllStaffs(page, limit);
        return pageBean;
    }

    /**
     * 添加员工页面
     * @return
     */
    @RequestMapping("addStaff")
    public String addStaff(){
        return "addStaff";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @RequestMapping("delStaff")
    @ResponseBody
    public String delStaff(int id){
        Boolean truth = staffService.removeStaff(id);
        return truth+"";
    }
}
