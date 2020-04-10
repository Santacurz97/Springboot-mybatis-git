package com.chinasofti.controller;

import com.chinasofti.entity.Staff;
import com.chinasofti.service.StaffService;
import com.chinasofti.util.PageBean;
import com.chinasofti.vo.StaffVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private StaffService staffService;

    /**
     * sprinmvc前端String与后端Date转换并自动绑定
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

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
        PageBean<Staff> allStaffs = staffService.selectAllStaffs(page, limit);
        return allStaffs;
    }

    /**
     * 模糊查询
     * @param staffId
     * @param staffName
     * @return
     */
    @RequestMapping("searchStaff")
    @ResponseBody
    public PageBean<Staff> searchStaff(int staffId, String staffName){
        PageBean<Staff> staff = staffService.searchStaff(staffId,staffName);
        System.out.println(staff);
        return staff;
    }

    //跳转修改页面，给出staffMessage
    @RequestMapping("toupdateStaff/{staffId}")
    public String toupdateStaff(@PathVariable(value="staffId") int staffid, Model model){
        List<Staff> list = staffService.selectOneStaff(staffid);
        StaffVo staffVo = staffService.search();
        model.addAttribute("staffVo",staffVo);
        model.addAttribute("staffMessage",list.get(0));
        return "updateStaff";
    }

    /**
     * 修改员工
     * @param
     * @return
     */
    @RequestMapping("updateStaff/{id}")
    public String updateStaff(Staff staffMessage,@PathVariable(value="id") int id){
        staffMessage.setStaffId(id);
        System.out.println(staffMessage);
        Boolean truth = staffService.updateStaff(staffMessage);
        //成功
        if(truth){
            return "redirect:/user/tostaff";
        }
        //失败
        System.out.printf("修改失败");
        return "staff";
    }

    /**
     * 跳转添加员工页面
     * @return
     */
    @RequestMapping("addstaff")
    public String addstaff(Model model){
        //查询部门表和岗位表
        StaffVo staffVo = staffService.search();
        model.addAttribute("staffVo",staffVo);
        return "addStaff";
    }

    /**
     * 添加员工
     * @param staff
     * @return
     */
    @RequestMapping("addStaff")
    public String addStaff(Staff staff){
        staff.setProbation(1);
        staff.setQuit(0);
        int i = staffService.addStaff(staff);
        if(i == 1){
            return "redirect:/user/tostaff";
        }
        return "user/addstaff";
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
