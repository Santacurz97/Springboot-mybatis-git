package com.chinasofti.controller;

import com.chinasofti.entity.Post;
import com.chinasofti.service.PostService;
import com.chinasofti.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    /**
     * 跳转至岗位
     * @return
     */
    @RequestMapping("toPost")
    public String toPost(){
        return "postjsp";
    }

    /**
     * 岗位信息表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("postList")
    @ResponseBody
    public PageBean<Post> postList(int page, int limit){
        PageBean<Post> pageBean = postService.selectAllPost(page, limit);
        return pageBean;
    }

    /**
     * 查询岗位页面
     * @return
     */
    @RequestMapping("searchPost")
    @ResponseBody
    public PageBean<Post> searchPost(int postid, String postName){
        PageBean<Post> post = postService.searchPost(postid,postName);
        return post;
    }

    /**
     * 删除岗位
     * @param id
     * @return
     */
    @RequestMapping("delPost")
    @ResponseBody
    public String delPost(int id){
        postService.deletPostById(id);
        return "redirect:../post/toPost";
    }

    /**
     * 添加岗位页面
     * @return
     */
    @RequestMapping("toaddpost")
    public String toaddPost(Model model){
        List<Post> postList = postService.queryAllPost();
        model.addAttribute("postList",postList);
        return "addPost";
    }

    @RequestMapping("addPost")
    public String addPost(HttpServletRequest request, Model model){
        String post_name = request.getParameter("title");
        int Spost_id=Integer.parseInt(request.getParameter("Spost"));
        Post post1 = new Post(post_name,Spost_id);
        postService.savePost(post1);
        return "redirect:../post/toPost";
    }

    /**
     * 修改岗位
     * @return
     */
    @RequestMapping("toupdatePost/{id}")
    public String toupdatePost(@PathVariable("id") Integer id,Model model){
        model.addAttribute("post",postService.queryMyPost(id));
        List<Post> postList = postService.queryAllPost();
        model.addAttribute("postList",postList);
        return "updatePost";
    }

    @RequestMapping("updatePost/{id}")
    public String updatePost(HttpServletRequest request,@PathVariable("id") Integer id, Model model){
        Post post = postService.queryMyPost(id);
        String name = request.getParameter("title");
        int Spost_id=Integer.parseInt(request.getParameter("Spost"));
        Post post1 = postService.queryMyPost(Spost_id);
        post.setPost_name(name);
//        System.out.println(name);
        post.setSpost_id(post1.getPost_id());
        postService.ModifyPostName(post);
        return "redirect:../toPost";
    }



















}
