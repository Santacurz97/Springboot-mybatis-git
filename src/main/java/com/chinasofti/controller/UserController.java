package com.chinasofti.controller;

import com.chinasofti.entity.TUser;
import com.chinasofti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(){
        TUser tUser = new TUser();
        tUser.setId(15);
        tUser.setName("wangqi");
        tUser.setUserName("wangqi123456");
        tUser.setPwd("258369147");
        userService.saveUser(tUser);
        return "redirect:/user/findAll";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<TUser> users = userService.search();
        model.addAttribute("users",users);
        return "showAll";
    }
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
