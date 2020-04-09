package com.chinasofti.controller;

import com.chinasofti.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

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
}
