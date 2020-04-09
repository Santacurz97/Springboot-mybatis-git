package com.chinasofti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PathController {

    /*
     *    默认路径
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String login(Model model){
        return "login";
    }
}
